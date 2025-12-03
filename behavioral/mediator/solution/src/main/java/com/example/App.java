package com.example;

/**
 * Demo application showing the chat system with Mediator pattern.
 * 
 * This demonstrates the refactored implementation using the Mediator pattern.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== Chat Application (Mediator Pattern) ===\n");
        
        ChatMediator mediator = new ChatRoom();
        
        User alice = new User("Alice", mediator);
        User bob = new User("Bob", mediator);
        User charlie = new User("Charlie", mediator);
        
        mediator.addUser(alice);
        mediator.addUser(bob);
        mediator.addUser(charlie);
        
        // Users send messages through the mediator
        alice.sendMessage("Bob", "Hello Bob!");
        bob.sendMessage("Alice", "Hi Alice!");
        charlie.sendMessage("Alice", "Hey Alice!");
        
        System.out.println("\n=== Demo Complete ===");
    }
}

