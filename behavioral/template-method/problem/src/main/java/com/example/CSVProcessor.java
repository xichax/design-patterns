package com.example;

public class CSVProcessor {
    public void process() {
        System.out.println("Processing CSV data...");
        readData();
        parseData();
        validateData();
        saveData();
        System.out.println("CSV processing complete");
    }
    
    private void readData() {
        System.out.println("  -> Reading CSV file");
    }
    
    private void parseData() {
        System.out.println("  -> Parsing CSV format");
    }
    
    private void validateData() {
        System.out.println("  -> Validating CSV data");
    }
    
    private void saveData() {
        System.out.println("  -> Saving processed CSV data");
    }
}
