package com.example.oyjs2.iymy;

public class add_list_item {
    String title;
    String time;
    String sub;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;
    boolean likes;

    public boolean isLikes() {
        return likes;
    }

    public void setLikes(boolean likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }


    public add_list_item(String id, String title, String time, boolean likes, String sub) {
        this.id = id;
        this.title = title;
        this.time = time;
        this.sub = sub;
        this.likes = likes;
    }
}
