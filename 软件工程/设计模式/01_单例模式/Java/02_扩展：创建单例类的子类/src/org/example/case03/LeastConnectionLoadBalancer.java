package org.example.case03;

public class LeastConnectionLoadBalancer extends LoadBalancer {
    static {
        SingletonRegistry.put(KEY, new LeastConnectionLoadBalancer());
    }

    private LeastConnectionLoadBalancer() {

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
