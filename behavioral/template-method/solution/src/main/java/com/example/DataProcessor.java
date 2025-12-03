package com.example;

public abstract class DataProcessor {
    // Template method - defines the algorithm skeleton
    public final void process() {
        System.out.println("Processing " + getDataType() + " data...");
        readData();
        parseData();
        validateData();
        saveData();
        System.out.println(getDataType() + " processing complete");
    }
    
    // Abstract methods - subclasses must implement
    protected abstract void readData();
    protected abstract void parseData();
    protected abstract void validateData();
    protected abstract void saveData();
    protected abstract String getDataType();
}

