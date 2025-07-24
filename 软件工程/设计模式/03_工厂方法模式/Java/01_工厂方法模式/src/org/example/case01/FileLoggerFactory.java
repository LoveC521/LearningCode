package org.example.case01;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        // 省略初始化文件日志记录器的代码
        return logger;
    }
}
