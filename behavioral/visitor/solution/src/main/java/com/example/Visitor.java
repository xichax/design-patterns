package com.example;

public interface Visitor {
    void visit(TextElement element);
    void visit(ImageElement element);
    void visit(TableElement element);
}

