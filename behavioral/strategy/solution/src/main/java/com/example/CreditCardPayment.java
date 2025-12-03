package com.example;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("  -> Validating card...");
        System.out.println("  -> Charging $" + amount);
        System.out.println("  -> Payment successful");
    }
}

