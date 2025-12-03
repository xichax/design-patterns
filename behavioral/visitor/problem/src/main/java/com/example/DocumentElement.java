package com.example;

public abstract class DocumentElement {
    protected String content;
    
    public DocumentElement(String content) {
        this.content = content;
    }
    
    public abstract void export();
    public abstract void print();
}
