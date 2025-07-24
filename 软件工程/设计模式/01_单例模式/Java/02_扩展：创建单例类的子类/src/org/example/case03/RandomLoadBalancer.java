package org.example.case03;

public class RandomLoadBalancer extends LoadBalancer {
    static {
        SingletonRegistry.put(KEY, new RandomLoadBalancer());
    }

    private RandomLoadBalancer() {

    }

    @Override
    public void addServer(String server) {

    }

    @Override
    public void removeServer(String server) {

    }

    @Override
    public String getServer() {
        return "";
    }
}
