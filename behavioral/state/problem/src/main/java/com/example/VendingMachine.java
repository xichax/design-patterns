package com.example;

public class VendingMachine {
    private String state;
    
    public VendingMachine() {
        this.state = "IDLE";
    }
    
    public void insertCoin() {
        if ("IDLE".equals(state)) {
            System.out.println("Coin inserted");
            state = "HAS_COIN";
        } else {
            System.out.println("Cannot insert coin in current state");
        }
    }
    
    public void selectProduct() {
        if ("HAS_COIN".equals(state)) {
            System.out.println("Product selected");
            state = "DISPENSING";
        } else {
            System.out.println("Please insert coin first");
        }
    }
    
    public void dispense() {
        if ("DISPENSING".equals(state)) {
            System.out.println("Product dispensed");
            state = "IDLE";
        } else {
            System.out.println("Cannot dispense in current state");
        }
    }
}
