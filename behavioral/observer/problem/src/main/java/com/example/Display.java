package com.example;

public class Display {
    private String name;
    
    public Display(String name) {
        this.name = name;
    }
    
    public void update(int temperature) {
        System.out.println(name + ": Temperature is " + temperature + "°C");
    }
}
