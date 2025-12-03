package com.example;

/**
 * Demo application showing the support ticket processing system.
 * 
 * This demonstrates the refactored implementation using the Chain of Responsibility pattern.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== Support Ticket Processor (Chain of Responsibility) ===\n");
        
        // Build the chain of handlers
        SupportHandler criticalHandler = new CriticalSupportHandler();
        SupportHandler highHandler = new HighPrioritySupportHandler();
        SupportHandler mediumHandler = new MediumPrioritySupportHandler();
        SupportHandler lowHandler = new LowPrioritySupportHandler();
        SupportHandler defaultHandler = new DefaultSupportHandler();
        
        // Chain them together
        criticalHandler.setNext(highHandler);
        highHandler.setNext(mediumHandler);
        mediumHandler.setNext(lowHandler);
        lowHandler.setNext(defaultHandler);
        
        // Process different types of tickets
        System.out.println("Processing tickets:\n");
        
        criticalHandler.handleRequest("LOW", "Password reset request");
        criticalHandler.handleRequest("MEDIUM", "Account access issue");
        criticalHandler.handleRequest("HIGH", "System outage reported");
        criticalHandler.handleRequest("CRITICAL", "Security breach detected");
        criticalHandler.handleRequest("LOW", "General inquiry");
        
        System.out.println("\n=== Demo Complete ===");
    }
}

