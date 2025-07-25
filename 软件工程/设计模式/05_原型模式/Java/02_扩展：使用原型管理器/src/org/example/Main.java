package org.example;

/**
 * 原型模式：带原型管理器
 */
public class Main {
    public static void main(String[] args) {
        // 创建原型并放入原型管理器中
        PrototypeManager prototypeManager = new PrototypeManager();
        WeekLog prototype = new WeekLog();
        prototype.setName("xxx周报");
        Attachment attachment = new Attachment();
        attachment.setName("xxx附件");
        prototype.setAttachment(attachment);
        prototypeManager.put("weekLog_xxx", prototype);

        // 从原型管理器中取出原型的克隆副本并据此创建周报
        WeekLog weekLog = prototypeManager.get("weekLog_xxx");
        weekLog.setDate("2025-07-23");
        weekLog.setContent("周报内容");
        System.out.println(weekLog);

        // 对比附件
        System.out.println("附件是否相同? " + (weekLog.getAttachment() == prototype.getAttachment()));
    }
}
