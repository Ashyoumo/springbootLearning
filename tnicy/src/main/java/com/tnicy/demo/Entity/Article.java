package com.tnicy.demo.Entity;

import java.sql.Date;

public class Article {

    private Integer aid;
    private String title;
    private Integer uid;
    private String username;
    private Date date;
    private String content;

    @Override
    public String toString() {
        return "Article{" +
                "aid=" + aid +
                ", title='" + title + '\'' +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }

    public Article(Integer aid, String title, Integer uid, String username, Date date, String content) {
        this.aid = aid;
        this.title = title;
        this.uid = uid;
        this.username = username;
        this.date = date;
        this.content = content;
    }

    public Article() {
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
