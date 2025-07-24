package org.example.case03;

public class IpHashLoadBalancer extends LoadBalancer {
    static {
        SingletonRegistry.put(KEY, new IpHashLoadBalancer());
    }

    private IpHashLoadBalancer() {

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
