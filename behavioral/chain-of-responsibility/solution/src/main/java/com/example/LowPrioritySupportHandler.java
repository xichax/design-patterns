package com.example;

/**
 * Handler for low priority support tickets.
 */
public class LowPrioritySupportHandler extends SupportHandler {
    
    @Override
    protected boolean canHandle(String priority) {
        return "LOW".equalsIgnoreCase(priority);
    }
    
    @Override
    protected void processTicket(String priority, String description) {
        System.out.println("Received ticket: [" + priority + "] " + description);
        System.out.println("  -> Assigning to junior support");
        System.out.println("  -> Setting SLA to 72 hours");
        System.out.println("  -> Ticket processed\n");
    }
}

