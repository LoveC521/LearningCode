package org.example.case01;


public abstract class LoadBalancer {
    private static volatile LoadBalancer INSTANCE;
    private static final String ENV_TYPE = "Load_Balancer_TYPE";

    protected LoadBalancer() {

    }

    public static LoadBalancer getInstance() {
        LoadBalancer localRef = INSTANCE;
        if (localRef == null) {
            synchronized (LoadBalancer.class) {
                localRef = INSTANCE;
                if (localRef == null) {
                    String className = System.getenv(ENV_TYPE);
                    if (className == null) {
                        throw new IllegalArgumentException("Environment variable not set or invalid: " + ENV_TYPE);
                    }
                    localRef = switch (className) {
                        case "ROUND" -> new RoundLoadBalancer();
                        case "RANDOM" -> new RandomLoadBalancer();
                        case "LEAST_CONNECTION" -> new LeastConnectionLoadBalancer();
                        case "IP_HASH" -> new IpHashLoadBalancer();
                        default -> throw new IllegalArgumentException("Unsupported load balancer type: " + className);
                    };
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
