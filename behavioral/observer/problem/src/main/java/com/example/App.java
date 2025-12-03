package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Weather Station ===\n");
        
        WeatherStation station = new WeatherStation();
        Display display1 = new Display("Display 1");
        Display display2 = new Display("Display 2");
        
        station.addDisplay(display1);
        station.addDisplay(display2);
        
        station.setTemperature(25);
        station.setTemperature(30);
        
        System.out.println("\n=== Demo Complete ===");
    }
}
