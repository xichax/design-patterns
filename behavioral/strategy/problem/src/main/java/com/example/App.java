package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Payment Processor ===\n");
        
        PaymentProcessor processor = new PaymentProcessor();
        
        processor.processPayment("CREDIT_CARD", 100.0);
        processor.processPayment("PAYPAL", 50.0);
        processor.processPayment("BITCOIN", 200.0);
        
        System.out.println("\n=== Demo Complete ===");
    }
}
