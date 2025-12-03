package com.example;

public class ExportVisitor implements Visitor {
    @Override
    public void visit(TextElement element) {
        System.out.println("  -> Exporting text: " + element.content);
    }
    
    @Override
    public void visit(ImageElement element) {
        System.out.println("  -> Exporting image: " + element.content);
    }
    
    @Override
    public void visit(TableElement element) {
        System.out.println("  -> Exporting table: " + element.content);
    }
}

