package org.example;

import java.util.Optional;

public class WeekLog implements Prototype<WeekLog>{
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public WeekLog clone() {
        WeekLog weekLog = new WeekLog();
        weekLog.setContent(this.content);
        weekLog.setDate(this.date);
        weekLog.setName(this.name);
        return weekLog;
    }

    @Override
    public String toString() {
        return "WeekLog{" +
                "attachment=" + attachment +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
