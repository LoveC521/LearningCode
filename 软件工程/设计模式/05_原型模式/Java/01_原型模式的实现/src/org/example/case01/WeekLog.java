package org.example.case01;

import java.util.Optional;

public class WeekLog implements Prototype<WeekLog> {
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    @Override
    public String toString() {
        return "WeekLog{" +
                "attachment=" + attachment +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

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
        WeekLog cloneWeekLog = new WeekLog();
        cloneWeekLog.setContent(this.content);
        cloneWeekLog.setDate(this.date);
        cloneWeekLog.setName(this.name);
        cloneWeekLog.setAttachment(this.attachment);
        return cloneWeekLog;
    }
}
