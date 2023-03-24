package com.engim.esempiospring.model;

public class helloWorld {
    private int id;
    private String message;

    public helloWorld() {
    }

    public helloWorld(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
