package org.example.case03;

/**
 * 创建 Singleton 的子类：使用单件注册表
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // 选择唯一实例的类型
        Class.forName("org.example.case03.LeastConnectionLoadBalancer");

        LoadBalancer balancer = LoadBalancer.getInstance();
        System.out.println(balancer);
    }
}
