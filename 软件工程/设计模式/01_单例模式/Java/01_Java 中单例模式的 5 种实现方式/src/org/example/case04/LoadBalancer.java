package org.example.case04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static volatile LoadBalancer INSTANCE;
    private final List<String> SERVER_LIST = new ArrayList<>();
    private final Random RANDOM = new Random();

    private LoadBalancer() {

    }

    public static LoadBalancer getInstance() {
        // 性能优化：在命中缓存的情况下，每一次调用只需要访问一次 volatile 变量
        // 详细请参考文章：https://www.javacodemonk.com/threadsafe-singleton-design-pattern-java-806ad7e6
        LoadBalancer localRef = INSTANCE;
        if(localRef == null) {
            synchronized (LoadBalancer.class) {
                localRef = INSTANCE;
                if(localRef == null) {
                    localRef = new LoadBalancer();
                    INSTANCE = localRef;
                }
            }
        }

        return localRef;
    }

    public void addServer(String server) {
        SERVER_LIST.add(server);
    }

    public void removeServer(String server) {
        SERVER_LIST.remove(server);
    }

    public String getServer() {
        if (SERVER_LIST.isEmpty()) {
            throw new IllegalStateException("Cannot get a server: server list is empty.");
        }
        return SERVER_LIST.get(RANDOM.nextInt(SERVER_LIST.size()));
    }
}
