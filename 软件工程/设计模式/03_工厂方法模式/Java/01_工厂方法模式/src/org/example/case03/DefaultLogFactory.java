package org.example.case03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DefaultLogFactory implements LoggerFactory {

    @Override
    public Logger createLogger(Class<? extends Logger> clazz) {
        try {
            Constructor<? extends Logger> constructor = clazz.getConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
