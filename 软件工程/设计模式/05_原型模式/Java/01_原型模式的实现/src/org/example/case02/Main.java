package org.example.case02;

/**
 * 原型模式：深克隆
 */
public class Main {
    public static void main(String[] args) {
        // 创建原型
        WeekLog prototype = new WeekLog();
        prototype.setName("xxx周报");
        Attachment attachment = new Attachment();
        attachment.setName("xxx附件");
        prototype.setAttachment(attachment);

        // 获取原型的副本并据此创建周报
        WeekLog weekLog = prototype.clone();
        weekLog.setDate("2025-07-23");
        weekLog.setContent("周报内容");
        System.out.println(weekLog);

        // 对比附件
        System.out.println("附件是否相同? " + (weekLog.getAttachment() == prototype.getAttachment()));
    }
}
