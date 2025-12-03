package com.example;

public class User {
    private String name;
    
    public User(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void sendMessage(User recipient, String message) {
        System.out.println(name + " -> " + recipient.getName() + ": " + message);
    }
}
