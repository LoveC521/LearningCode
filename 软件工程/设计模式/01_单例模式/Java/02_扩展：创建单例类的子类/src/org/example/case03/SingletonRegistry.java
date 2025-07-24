package org.example.case03;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SingletonRegistry {
    private static final ConcurrentMap<String, Object> INSTANCE_MAP = new ConcurrentHashMap<>();

    public static void put(String key, Object instance) {
        INSTANCE_MAP.put(key, instance);
    }

    @SuppressWarnings("unchecked")
    public static <T>  T get(String key) {
        return (T) INSTANCE_MAP.get(key);
    }
}
