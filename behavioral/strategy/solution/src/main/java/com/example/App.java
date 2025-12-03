package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Payment Processor (Strategy Pattern) ===\n");
        
        PaymentProcessor processor = new PaymentProcessor();
        
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.processPayment(100.0);
        
        processor.setPaymentStrategy(new PayPalPayment());
        processor.processPayment(50.0);
        
        processor.setPaymentStrategy(new BitcoinPayment());
        processor.processPayment(200.0);
        
        System.out.println("\n=== Demo Complete ===");
    }
}

