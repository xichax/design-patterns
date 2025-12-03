package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete mediator implementation - a chat room.
 * 
 * REFACTORED: Centralizes all communication logic
 */
public class ChatRoom implements ChatMediator {
    private List<User> users;
    
    public ChatRoom() {
        this.users = new ArrayList<>();
    }
    
    @Override
    public void addUser(User user) {
        users.add(user);
    }
    
    @Override
    public void sendMessage(String message, String recipient, User sender) {
        // Find recipient and deliver message
        for (User user : users) {
            if (user.getName().equals(recipient)) {
                System.out.println(sender.getName() + " -> " + recipient + ": " + message);
                // Could add logging, filtering, etc. here without changing User class
                return;
            }
        }
        System.out.println("User '" + recipient + "' not found");
    }
}

