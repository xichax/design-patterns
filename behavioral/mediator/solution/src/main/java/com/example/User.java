package com.example;

/**
 * Represents a user in the chat system.
 * 
 * REFACTORED: Users communicate through mediator, not directly
 */
public class User {
    private String name;
    private ChatMediator mediator;
    
    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    
    public String getName() {
        return name;
    }
    
    /**
     * REFACTORED: Sends message through mediator instead of directly
     * - No direct coupling to other users
     * - Easy to add features in mediator without changing this class
     */
    public void sendMessage(String recipient, String message) {
        mediator.sendMessage(message, recipient, this);
    }
}

