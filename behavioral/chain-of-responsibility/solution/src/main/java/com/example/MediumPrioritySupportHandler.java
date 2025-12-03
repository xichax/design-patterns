package com.example;

/**
 * Handler for medium priority support tickets.
 */
public class MediumPrioritySupportHandler extends SupportHandler {
    
    @Override
    protected boolean canHandle(String priority) {
        return "MEDIUM".equalsIgnoreCase(priority);
    }
    
    @Override
    protected void processTicket(String priority, String description) {
        System.out.println("Received ticket: [" + priority + "] " + description);
        System.out.println("  -> Assigning to support team");
        System.out.println("  -> Setting SLA to 24 hours");
        System.out.println("  -> Ticket processed\n");
    }
}

