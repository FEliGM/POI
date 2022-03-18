package com.example.mychat;

public class message {
    String text;
    String username;

    public message(String text, String username) {
        this.text = text;
        this.username = username;
    }

    public String getText(){
        return  text;
    }

    public String getUsername(){
        return username;
    }
}
