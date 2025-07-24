package org.example.case01;

public class Printer {
    private String departmentName;

    public Printer(String departmentName) {
        this.departmentName = departmentName;
    }

    public void print() {
        System.out.println("Printer in department [" + departmentName + "] is printing.");
    }
}
