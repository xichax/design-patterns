package com.example;

public class ImageElement extends DocumentElement {
    public ImageElement(String content) {
        super(content);
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

