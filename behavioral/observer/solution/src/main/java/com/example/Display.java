package com.example;

public class Display implements Observer {
    private String name;
    
    public Display(String name) {
        this.name = name;
    }
    
    @Override
    public void update(int temperature) {
        System.out.println(name + ": Temperature is " + temperature + "°C");
    }
}

