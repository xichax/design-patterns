package com.example;

public class CSVProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("  -> Reading CSV file");
    }
    
    @Override
    protected void parseData() {
        System.out.println("  -> Parsing CSV format");
    }
    
    @Override
    protected void validateData() {
        System.out.println("  -> Validating CSV data");
    }
    
    @Override
    protected void saveData() {
        System.out.println("  -> Saving processed CSV data");
    }
    
    @Override
    protected String getDataType() {
        return "CSV";
    }
}

