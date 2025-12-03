package com.example;

public class SupportTicketProcessor {
    
    public void processTicket(String priority, String description) {
        System.out.println("Received ticket: [" + priority + "] " + description);
        
        if ("CRITICAL".equalsIgnoreCase(priority)) {
            System.out.println("  -> Escalating to on-call engineer immediately");
            System.out.println("  -> Sending urgent notification to management");
            System.out.println("  -> Creating incident report");
        } else if ("HIGH".equalsIgnoreCase(priority)) {
            System.out.println("  -> Assigning to senior support team");
            System.out.println("  -> Setting SLA to 2 hours");
        } else if ("MEDIUM".equalsIgnoreCase(priority)) {
            System.out.println("  -> Assigning to support team");
            System.out.println("  -> Setting SLA to 24 hours");
        } else if ("LOW".equalsIgnoreCase(priority)) {
            System.out.println("  -> Assigning to junior support");
            System.out.println("  -> Setting SLA to 72 hours");
        } else {
            System.out.println("  -> Unknown priority, assigning to general queue");
        }
        
        System.out.println("  -> Ticket processed\n");
    }
}
