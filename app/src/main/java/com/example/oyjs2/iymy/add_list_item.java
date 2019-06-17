package com.example.oyjs2.iymy;

public class add_list_item {
    String title;
    String time;
    String sub;
    int likes;

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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public add_list_item(String title, String time, String sub, int likes) {

        this.title = title;
        this.time = time;
        this.sub = sub;
        this.likes = likes;
    }
}
