package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Document Processor (Visitor Pattern) ===\n");
        
        Document document = new Document();
        document.addElement(new TextElement("Hello World"));
        document.addElement(new ImageElement("photo.jpg"));
        document.addElement(new TableElement("Data Table"));
        
        // Operations are now visitors - easy to add new operations
        document.accept(new ExportVisitor());
        document.accept(new PrintVisitor());
        
        System.out.println("\n=== Demo Complete ===");
    }
}

