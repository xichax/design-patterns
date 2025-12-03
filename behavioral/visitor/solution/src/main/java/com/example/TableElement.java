package com.example;

public class TableElement extends DocumentElement {
    public TableElement(String content) {
        super(content);
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

