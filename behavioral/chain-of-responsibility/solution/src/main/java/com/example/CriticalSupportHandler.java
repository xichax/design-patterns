package com.example;

/**
 * Handler for critical priority support tickets.
 */
public class CriticalSupportHandler extends SupportHandler {
    
    @Override
    protected boolean canHandle(String priority) {
        return "CRITICAL".equalsIgnoreCase(priority);
    }
    
    @Override
    protected void processTicket(String priority, String description) {
        System.out.println("Received ticket: [" + priority + "] " + description);
        System.out.println("  -> Escalating to on-call engineer immediately");
        System.out.println("  -> Sending urgent notification to management");
        System.out.println("  -> Creating incident report");
        System.out.println("  -> Ticket processed\n");
    }
}

