package org.example;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PrototypeManager {
    private final ConcurrentMap<String, Prototype<?>> prototypeTable = new ConcurrentHashMap<>();

    public <T extends Prototype<T>> void put(String key, T prototype) {
        prototypeTable.put(key, prototype);
    }

    @SuppressWarnings("unchecked")
    public <T extends Prototype<T>> T get(String key) {
        return (T) prototypeTable.get(key).clone();
    }

    @SuppressWarnings("unchecked")
    public <T extends Prototype<T>> T remove(String key) {
        return (T) prototypeTable.remove(key);
    }
}
