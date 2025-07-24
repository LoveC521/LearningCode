package org.example.case03;

public abstract class LoadBalancer {
    protected static final String KEY = "org.example.case03.LoadBalancer";

    public static LoadBalancer getInstance() {
        return SingletonRegistry.get(KEY);
    }

    public abstract void addServer(String server);

    public abstract void removeServer(String server);

    public abstract String getServer();
}
