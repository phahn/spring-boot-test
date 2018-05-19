package com.example.springboottest;

public class Post {
    private final Long id;
    private final String title;
    private final String body;

    public Post(Long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public String getBody() {
        return body;
    }

}
