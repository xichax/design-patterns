package com.example;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
        System.out.println("  -> Generating wallet address...");
        System.out.println("  -> Waiting for blockchain confirmation...");
        System.out.println("  -> Payment successful");
    }
}

