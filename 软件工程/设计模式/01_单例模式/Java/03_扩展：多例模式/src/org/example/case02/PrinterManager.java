package org.example.case02;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PrinterManager {
    private static final ConcurrentMap<String, Printer> MAP = new ConcurrentHashMap<>();
    private static final int MAX_PRINTER_INSTANCES = 2;

    private PrinterManager() {

    }

    public static Printer getInstance(String departmentName) {
        Printer printer = MAP.get(departmentName);
        if (printer == null) {
            synchronized (PrinterManager.class) {
                printer = MAP.get(departmentName);
                if (printer == null) {
                    if (MAP.size() < MAX_PRINTER_INSTANCES) {
                        printer = new Printer(departmentName);
                        MAP.put(departmentName, printer);
                    }else {
                        throw new RuntimeException("Department '" + departmentName + "' cannot get a printer now. " +
                                "All printers are in use. Please wait...");
                    }
                }
            }

        }

        return printer;
    }

    public static void releasePrinter(String departmentName) {
        Printer removed = MAP.remove(departmentName);
        if (removed != null) {
            System.out.println("Printer released by department: " + departmentName);
        } else {
            System.out.println("No printer was assigned to department: " + departmentName);
        }
    }
}
