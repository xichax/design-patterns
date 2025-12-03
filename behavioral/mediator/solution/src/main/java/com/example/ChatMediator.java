package com.example;

/**
 * Mediator interface for chat communication.
 * 
 * REFACTORED: Uses Mediator pattern
 * - Centralizes communication between users
 * - Decouples users from each other
 * - Makes it easy to add features like logging, filtering, or group chats
 * 
 * Design Pattern: Mediator Pattern
 * - Mediator: Defines interface for communication
 * - ConcreteMediator: Implements communication logic
 * - Colleague: Objects that communicate through mediator
 */
public interface ChatMediator {
    void sendMessage(String message, String recipient, User sender);
    void addUser(User user);
}

