package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Data Processor ===\n");
        
        CSVProcessor csv = new CSVProcessor();
        csv.process();
        
        JSONProcessor json = new JSONProcessor();
        json.process();
        
        System.out.println("\n=== Demo Complete ===");
    }
}
