package com.example;

public class TableElement extends DocumentElement {
    public TableElement(String content) {
        super(content);
    }
    
    @Override
    public void export() {
        System.out.println("  -> Exporting table: " + content);
    }
    
    @Override
    public void print() {
        System.out.println("  -> Printing table: " + content);
    }
}
