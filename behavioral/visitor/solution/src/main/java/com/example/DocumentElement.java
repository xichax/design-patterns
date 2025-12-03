package com.example;

public abstract class DocumentElement {
    protected String content;
    
    public DocumentElement(String content) {
        this.content = content;
    }
    
    public abstract void accept(Visitor visitor);
}

