package org.example;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ProxyFactory {
    @SuppressWarnings("unchecked")
    public static  <T> T getProxy(T t)  {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Searcher.class);
        enhancer.setCallback(new MethodInterceptor() {
            private AccessValidator validator;
            private Logger logger;
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                if (method.getName().equals("doSearch") &&
                        Arrays.equals(method.getParameterTypes(), new Class[]{String.class, String.class})) {
                    String userId = (String) args[0];
                    if (validate(userId)) {
                        Object obj = method.invoke(t, args);
                        log(userId);
                        return obj;
                    }else {
                        return null;
                    }
                }else {
                    return method.invoke(t,args);
                }
            }

            private boolean validate(String userId) {
                validator = new AccessValidator();
                return validator.validate(userId);
            }

            private void log(String userId) {
                logger = new Logger();
                logger.log(userId);
            }
        });

        return (T) enhancer.create();
    }
}
