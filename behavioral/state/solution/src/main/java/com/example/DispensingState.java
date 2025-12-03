package com.example;

public class DispensingState implements State {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Cannot insert coin while dispensing");
    }
    
    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Product already selected");
    }
    
    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Product dispensed");
        machine.setState(new IdleState());
    }
}

