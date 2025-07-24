package org.example.case01;

/**
 * 工厂方法模式实现：工厂方法不包含类型控制参数
 */
public class Main {
    public static void main(String[] args) {
        // 可以使用环境变量来优化客户端调用
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
