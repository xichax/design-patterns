package com.example;

public class JSONProcessor {
    public void process() {
        System.out.println("Processing JSON data...");
        readData();
        parseData();
        validateData();
        saveData();
        System.out.println("JSON processing complete");
    }
    
    private void readData() {
        System.out.println("  -> Reading JSON file");
    }
    
    private void parseData() {
        System.out.println("  -> Parsing JSON format");
    }
    
    private void validateData() {
        System.out.println("  -> Validating JSON data");
    }
    
    private void saveData() {
        System.out.println("  -> Saving processed JSON data");
    }
}
