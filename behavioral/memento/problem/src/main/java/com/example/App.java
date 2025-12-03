package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Text Editor Demo ===\n");
        
        Document document = new Document();
        DocumentHistory history = new DocumentHistory();
        
        System.out.println("Initial: '" + document.getContent() + "'");
        
        document.setContent("Hello");
        history.save(document);
        System.out.println("After 'Hello': '" + document.getContent() + "'");
        
        document.setContent("Hello World");
        history.save(document);
        System.out.println("After 'Hello World': '" + document.getContent() + "'");
        
        document.setContent("Hello World!");
        history.save(document);
        System.out.println("After 'Hello World!': '" + document.getContent() + "'");
        
        System.out.println("\n--- Undo Operations ---");
        System.out.println("Undo count: " + history.getUndoCount());
        
        history.undo(document);
        System.out.println("After undo: '" + document.getContent() + "'");
        
        history.undo(document);
        System.out.println("After undo: '" + document.getContent() + "'");
        
        System.out.println("\n--- Redo Operations ---");
        System.out.println("Redo count: " + history.getRedoCount());
        
        history.redo(document);
        System.out.println("After redo: '" + document.getContent() + "'");
        
        history.redo(document);
        System.out.println("After redo: '" + document.getContent() + "'");
        
        System.out.println("\n--- New Change Clears Redo ---");
        document.setContent("Hello Universe!");
        history.save(document);
        System.out.println("After 'Hello Universe!': '" + document.getContent() + "'");
        System.out.println("Can redo? " + history.canRedo());
        
        System.out.println("\n=== Demo Complete ===");
    }
}
