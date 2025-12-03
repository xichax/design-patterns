package com.example;

public class ImageElement extends DocumentElement {
    public ImageElement(String content) {
        super(content);
    }
    
    @Override
    public void export() {
        System.out.println("  -> Exporting image: " + content);
    }
    
    @Override
    public void print() {
        System.out.println("  -> Printing image: " + content);
    }
}
