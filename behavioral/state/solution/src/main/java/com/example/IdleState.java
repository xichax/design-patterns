package com.example;

public class IdleState implements State {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted");
        machine.setState(new HasCoinState());
    }
    
    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Please insert coin first");
    }
    
    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Cannot dispense in current state");
    }
}

