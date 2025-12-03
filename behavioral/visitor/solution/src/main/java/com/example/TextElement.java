package com.example;

public class TextElement extends DocumentElement {
    public TextElement(String content) {
        super(content);
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

