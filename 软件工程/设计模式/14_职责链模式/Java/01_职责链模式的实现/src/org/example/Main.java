package org.example;

public class Main {
    public static void main(String[] args) {
        Approver director = new Director("张无忌");
        Approver vicePresident = new VicePresident("杨过");
        Approver president = new President("郭靖");
        Approver congress = new Congress("董事会");

        // 创建职责链
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        // 创建采购单
        director.processRequest(new PurchaseRequest(45000, 10001, "购买倚天剑"));
        director.processRequest(new PurchaseRequest(60000, 10002, "购买《葵花宝典》"));
        director.processRequest(new PurchaseRequest(160000, 10003, "购买《金刚经》"));
        director.processRequest(new PurchaseRequest(800000, 10004, "购买桃花岛"));
    }
}
