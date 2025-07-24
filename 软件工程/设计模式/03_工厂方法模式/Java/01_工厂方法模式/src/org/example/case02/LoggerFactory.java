package org.example.case02;

public interface LoggerFactory {
    Logger createLogger(String type);
    Logger createLogger(LogType logType);
}
