package org.example.case02;

import java.util.ServiceLoader;

public abstract class LoadBalancer {
    private static volatile LoadBalancer INSTANCE;

    public static LoadBalancer getInstance() {
        LoadBalancer localRef = INSTANCE;
        if (localRef == null) {
            synchronized (LoadBalancer.class) {
                localRef = INSTANCE;
                if (localRef == null) {
                    ServiceLoader<LoadBalancer> loader = ServiceLoader.load(LoadBalancer.class);
                    localRef = loader.findFirst()
                            .orElseThrow(() -> new IllegalStateException("No LoadBalancer implementation found"));
                    INSTANCE = localRef;
                }
            }
        }

        return localRef;
    }

    public abstract void addServer(String server);

    public abstract void removeServer(String server);

    public abstract String getServer();
}
