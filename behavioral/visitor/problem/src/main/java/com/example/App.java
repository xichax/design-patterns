package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Document Processor ===\n");
        
        Document document = new Document();
        document.addElement(new TextElement("Hello World"));
        document.addElement(new ImageElement("photo.jpg"));
        document.addElement(new TableElement("Data Table"));
        
        document.export();
        document.print();
        
        System.out.println("\n=== Demo Complete ===");
    }
}
