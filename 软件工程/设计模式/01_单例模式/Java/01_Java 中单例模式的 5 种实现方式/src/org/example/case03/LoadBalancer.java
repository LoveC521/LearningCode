package org.example.case03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static LoadBalancer INSTANCE;
    private final List<String> SERVER_LIST = new ArrayList<>();
    private final Random RANDOM = new Random();

    private LoadBalancer() {

    }

    public static synchronized LoadBalancer getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LoadBalancer();
        }

        return INSTANCE;
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
