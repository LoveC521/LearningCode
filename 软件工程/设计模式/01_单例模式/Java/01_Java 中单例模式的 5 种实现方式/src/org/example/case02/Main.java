package org.example.case02;

/**
 * 饿汉式（枚举类）
 */
public class Main {
    public static void main(String[] args) {
        LoadBalancer loadBalancer = LoadBalancer.getInstance();

        loadBalancer.addServer("server1");
        loadBalancer.addServer("server2");
        loadBalancer.addServer("server3");

        for(int i = 0; i < 10; i++) {
            System.out.println("分发请求至服务器: " + loadBalancer.getServer());
        }
    }
}
