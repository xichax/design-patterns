package com.example;

/**
 * Default handler for unknown priority levels.
 * This should be the last handler in the chain.
 */
public class DefaultSupportHandler extends SupportHandler {
    
    @Override
    protected boolean canHandle(String priority) {
        // Default handler accepts any priority that reaches it
        return true;
    }
    
    @Override
    protected void processTicket(String priority, String description) {
        System.out.println("Received ticket: [" + priority + "] " + description);
        System.out.println("  -> Unknown priority, assigning to general queue");
        System.out.println("  -> Ticket processed\n");
    }
}

