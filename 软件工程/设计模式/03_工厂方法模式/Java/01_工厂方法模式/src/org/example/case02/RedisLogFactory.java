package org.example.case02;

public class RedisLogFactory extends DefaultLogFactory{
    @Override
    public Logger createLogger(String type) {
        if ("redis".equalsIgnoreCase(type)) {
            return new RedisLogger();
        }
        // 剩余类型交给父类处理
        return super.createLogger(type);
    }
}
