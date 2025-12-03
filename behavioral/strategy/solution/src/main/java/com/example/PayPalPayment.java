package com.example;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("  -> Redirecting to PayPal...");
        System.out.println("  -> Processing $" + amount);
        System.out.println("  -> Payment successful");
    }
}

