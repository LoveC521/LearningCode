package org.example.case01;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PrinterManager {
    private static final ConcurrentMap<String, Printer> MAP = new ConcurrentHashMap<>();

    static {
        MAP.put("人力资源部", new Printer("人力资源部"));
        MAP.put("财务部", new Printer("财务部"));
        MAP.put("销售部", new Printer("销售部"));
    }

    private PrinterManager() {

    }

    public static Printer getInstance(String departmentName) {
        Printer printer = MAP.get(departmentName);
        if (printer == null) {
            throw new RuntimeException("No printer is available for department: " + departmentName +
                    ". Only predefined departments are supported.");
        }
        return printer;
    }
}
