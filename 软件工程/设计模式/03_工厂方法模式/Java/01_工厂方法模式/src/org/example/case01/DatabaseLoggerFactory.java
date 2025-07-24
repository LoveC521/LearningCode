package org.example.case01;

public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        // 省略初始化数据库日志记录器的代码
        return logger;
    }
}
