package org.example.case03;

/**
 * 懒汉式（单检查锁）
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
