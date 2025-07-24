package org.example.case03;

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
