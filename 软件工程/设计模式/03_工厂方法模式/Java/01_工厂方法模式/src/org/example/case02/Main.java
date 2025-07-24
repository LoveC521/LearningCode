package org.example.case02;

/**
 * 工厂方法模式实现：工厂方法包含类型控制参数 <br>
 * 对工厂方法进行了重载
 */
public class Main {
    public static void main(String[] args) {
        // 可以使用环境变量来优化客户端调用
        LoggerFactory factory = new DefaultLogFactory();

        Logger logger = factory.createLogger("file");
        logger.writeLog();
    }
}
