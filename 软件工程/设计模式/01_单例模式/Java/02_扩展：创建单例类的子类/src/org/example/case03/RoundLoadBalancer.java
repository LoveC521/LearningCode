package org.example.case03;

public class RoundLoadBalancer extends LoadBalancer {
    static {
        SingletonRegistry.put(KEY, new RoundLoadBalancer());
    }

    private RoundLoadBalancer() {

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
