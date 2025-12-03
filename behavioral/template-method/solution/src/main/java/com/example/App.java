package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Data Processor (Template Method Pattern) ===\n");
        
        DataProcessor csv = new CSVProcessor();
        csv.process();
        
        DataProcessor json = new JSONProcessor();
        json.process();
        
        System.out.println("\n=== Demo Complete ===");
    }
}

