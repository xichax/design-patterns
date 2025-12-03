package com.example;

public class JSONProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("  -> Reading JSON file");
    }
    
    @Override
    protected void parseData() {
        System.out.println("  -> Parsing JSON format");
    }
    
    @Override
    protected void validateData() {
        System.out.println("  -> Validating JSON data");
    }
    
    @Override
    protected void saveData() {
        System.out.println("  -> Saving processed JSON data");
    }
    
    @Override
    protected String getDataType() {
        return "JSON";
    }
}

