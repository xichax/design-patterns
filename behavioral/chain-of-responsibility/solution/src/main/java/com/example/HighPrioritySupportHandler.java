package com.example;

/**
 * Handler for high priority support tickets.
 */
public class HighPrioritySupportHandler extends SupportHandler {
    
    @Override
    protected boolean canHandle(String priority) {
        return "HIGH".equalsIgnoreCase(priority);
    }
    
    @Override
    protected void processTicket(String priority, String description) {
        System.out.println("Received ticket: [" + priority + "] " + description);
        System.out.println("  -> Assigning to senior support team");
        System.out.println("  -> Setting SLA to 2 hours");
        System.out.println("  -> Ticket processed\n");
    }
}

