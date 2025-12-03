package com.example;

public class TextElement extends DocumentElement {
    public TextElement(String content) {
        super(content);
    }
    
    @Override
    public void export() {
        System.out.println("  -> Exporting text: " + content);
    }
    
    @Override
    public void print() {
        System.out.println("  -> Printing text: " + content);
    }
}
