package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Weather Station (Observer Pattern) ===\n");
        
        WeatherStation station = new WeatherStation();
        Observer display1 = new Display("Display 1");
        Observer display2 = new Display("Display 2");
        
        station.addObserver(display1);
        station.addObserver(display2);
        
        station.setTemperature(25);
        station.setTemperature(30);
        
        station.removeObserver(display1);
        station.setTemperature(35);
        
        System.out.println("\n=== Demo Complete ===");
    }
}

