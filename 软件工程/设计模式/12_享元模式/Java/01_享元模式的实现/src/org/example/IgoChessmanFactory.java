package org.example;

import java.util.HashMap;

public class IgoChessmanFactory {
    private static final HashMap<String, IgoChessman> map = new HashMap<>();

    static {
        map.put("b", new BlackIgoChessman());
        map.put("w", new WhiteIgoChessman());
    }

    public static IgoChessman getIgoChessman(String color) {
        return map.get(color);
    }
}
