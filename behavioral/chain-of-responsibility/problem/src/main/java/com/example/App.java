package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Support Ticket Processor ===\n");
        
        SupportTicketProcessor processor = new SupportTicketProcessor();
        
        System.out.println("Processing tickets:\n");
        
        processor.processTicket("LOW", "Password reset request");
        processor.processTicket("MEDIUM", "Account access issue");
        processor.processTicket("HIGH", "System outage reported");
        processor.processTicket("CRITICAL", "Security breach detected");
        processor.processTicket("LOW", "General inquiry");
        
        System.out.println("\n=== Demo Complete ===");
    }
}
