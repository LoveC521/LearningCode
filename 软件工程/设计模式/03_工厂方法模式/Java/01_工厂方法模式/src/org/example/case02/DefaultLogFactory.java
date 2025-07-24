package org.example.case02;

public class DefaultLogFactory implements LoggerFactory{
    @Override
    public Logger createLogger(String type) {
        if ("database".equalsIgnoreCase(type)) {
            // 省略初始化数据库日志记录器的代码
            return new DatabaseLogger();
        }else if ("file".equalsIgnoreCase(type)) {
            // 省略初始化文件日志记录器的代码
            return new FileLogger();
        }else {
            throw new IllegalArgumentException("Unsupported logger type: " + type);
        }
    }

    @Override
    public Logger createLogger(LogType logType) {
        return switch (logType) {
            case DATABASE -> {
                // 省略初始化数据库日志记录器的代码
                yield new DatabaseLogger();
            }
            case FILE -> {
                // 省略初始化文件日志记录器的代码
                yield new FileLogger();
            }
        };
    }
}
