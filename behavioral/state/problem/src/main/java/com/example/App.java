package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Vending Machine ===\n");
        
        VendingMachine machine = new VendingMachine();
        
        machine.insertCoin();
        machine.selectProduct();
        machine.dispense();
        
        System.out.println("\n=== Demo Complete ===");
    }
}
