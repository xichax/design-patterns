package com.example;

public class PrintVisitor implements Visitor {
    @Override
    public void visit(TextElement element) {
        System.out.println("  -> Printing text: " + element.content);
    }
    
    @Override
    public void visit(ImageElement element) {
        System.out.println("  -> Printing image: " + element.content);
    }
    
    @Override
    public void visit(TableElement element) {
        System.out.println("  -> Printing table: " + element.content);
    }
}

