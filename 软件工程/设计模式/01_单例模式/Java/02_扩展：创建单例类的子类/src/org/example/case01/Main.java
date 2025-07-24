package org.example.case01;

/**
 * 创建 Singleton 的子类
 */
public class Main {
    // 运行前请设置环境变量 Load_Balancer_TYPE
    public static void main(String[] args) {
        LoadBalancer balancer = LoadBalancer.getInstance();
        System.out.println(balancer);
    }
}
