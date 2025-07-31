package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    @SuppressWarnings("unchecked")
    public static  <T> T getProxy(T t)  {
        return (T) Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                new Class[]{Searcher.class},
                new InvocationHandler() {
                    private AccessValidator validator;
                    private Logger logger;
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
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
                }
        );
    }

}
