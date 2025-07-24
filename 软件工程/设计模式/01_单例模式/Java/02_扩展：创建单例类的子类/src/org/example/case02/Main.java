package org.example.case02;

/**
 * 创建 Singleton 的子类：使用 ServiceLoader 动态链接指定单例类
 */
public class Main {
    // 更换唯一单例只需要更改 src/META-INF/services/org.example.case02.LoadBalancer 文件
    public static void main(String[] args) {
        LoadBalancer balancer = LoadBalancer.getInstance();
        System.out.println(balancer);
    }
}