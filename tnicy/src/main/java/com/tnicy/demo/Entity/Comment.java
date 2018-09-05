package com.tnicy.demo.Entity;

import java.sql.Date;

public class Comment {
    private Integer aid;
    private Integer uid;
    private String username;
    private Date time;
    private String content;

    public Comment(Integer aid, Integer uid, String username, Date time, String content) {
        this.aid = aid;
        this.uid = uid;
        this.username = username;
        this.time = time;
        this.content = content;
    }

    public Comment() {
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
