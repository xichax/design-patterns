package com.example;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> elements;
    
    public Document() {
        this.elements = new ArrayList<>();
    }
    
    public void addElement(DocumentElement element) {
        elements.add(element);
    }
    
    public void export() {
        System.out.println("Exporting document...");
        for (DocumentElement element : elements) {
            element.export();
        }
    }
    
    public void print() {
        System.out.println("Printing document...");
        for (DocumentElement element : elements) {
            element.print();
        }
    }
}
