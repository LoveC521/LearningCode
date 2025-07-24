package org.example.case02;

public class RedisLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("Redis 日志记录");
    }
}
