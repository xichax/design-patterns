package com.example;

public class PaymentProcessor {
    
    public void processPayment(String method, double amount) {
        if ("CREDIT_CARD".equals(method)) {
            System.out.println("Processing credit card payment of $" + amount);
            System.out.println("  -> Validating card...");
            System.out.println("  -> Charging $" + amount);
            System.out.println("  -> Payment successful");
        } else if ("PAYPAL".equals(method)) {
            System.out.println("Processing PayPal payment of $" + amount);
            System.out.println("  -> Redirecting to PayPal...");
            System.out.println("  -> Processing $" + amount);
            System.out.println("  -> Payment successful");
        } else if ("BITCOIN".equals(method)) {
            System.out.println("Processing Bitcoin payment of $" + amount);
            System.out.println("  -> Generating wallet address...");
            System.out.println("  -> Waiting for blockchain confirmation...");
            System.out.println("  -> Payment successful");
        } else {
            System.out.println("Unknown payment method: " + method);
        }
    }
}
