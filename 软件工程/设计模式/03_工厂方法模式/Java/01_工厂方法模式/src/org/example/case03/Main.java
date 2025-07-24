package org.example.case03;

/**
 * 工厂方法模式实现：工厂方法包含类型控制参数 <br>
 * 使用类限定名
 */
public class Main {
    public static void main(String[] args) {
        // 可以使用环境变量来优化客户端调用
        LoggerFactory factory = new DefaultLogFactory();
        Logger logger = factory.createLogger(RedisLogger.class);
        logger.writeLog();
    }
}
