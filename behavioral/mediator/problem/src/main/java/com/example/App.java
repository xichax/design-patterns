package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Chat Application ===\n");
        
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");
        
        alice.sendMessage(bob, "Hello Bob!");
        bob.sendMessage(alice, "Hi Alice!");
        charlie.sendMessage(alice, "Hey Alice!");
        
        System.out.println("\n=== Demo Complete ===");
    }
}
