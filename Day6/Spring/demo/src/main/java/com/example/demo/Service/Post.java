package com.example.demo.Service;

import java.io.Serializable;

public class Post implements Serializable {
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return this.userId;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
