package org.example.case03;

public interface LoggerFactory {
    Logger createLogger(Class<? extends Logger> clazz);
}
