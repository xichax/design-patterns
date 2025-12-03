package com.example;

public class VendingMachine {
    private State state;
    
    public VendingMachine() {
        this.state = new IdleState();
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void insertCoin() {
        state.insertCoin(this);
    }
    
    public void selectProduct() {
        state.selectProduct(this);
    }
    
    public void dispense() {
        state.dispense(this);
    }
}

