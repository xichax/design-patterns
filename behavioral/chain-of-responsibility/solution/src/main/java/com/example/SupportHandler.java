package com.example;

/**
 * Abstract base class for support ticket handlers.
 * 
 * REFACTORED: Uses Chain of Responsibility pattern
 * Each handler can either handle the request or pass it to the next handler.
 * 
 * Design Pattern: Chain of Responsibility
 * - Allows multiple objects to handle a request without coupling the sender
 * - Each handler decides whether to process the request or pass it along
 * - Makes it easy to add or remove handlers dynamically
 */
public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    
    /**
     * Sets the next handler in the chain.
     * @param nextHandler The next handler to call if this one can't handle the request
     */
    public void setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    /**
     * Handles a support ticket request.
     * If this handler can process the request, it does so.
     * Otherwise, it passes the request to the next handler in the chain.
     * 
     * @param priority The priority level
     * @param description The ticket description
     */
    public void handleRequest(String priority, String description) {
        if (canHandle(priority)) {
            processTicket(priority, description);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority, description);
        } else {
            // No handler found - this shouldn't happen if we have a default handler
            System.out.println("  -> No handler available for priority: " + priority);
        }
    }
    
    /**
     * Checks if this handler can process the given priority.
     * @param priority The priority level
     * @return true if this handler can process it, false otherwise
     */
    protected abstract boolean canHandle(String priority);
    
    /**
     * Processes the ticket. This method is called when this handler
     * determines it can handle the request.
     * 
     * @param priority The priority level
     * @param description The ticket description
     */
    protected abstract void processTicket(String priority, String description);
}

