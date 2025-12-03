package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Text Editor ===\n");
        
        TextEditor editor = new TextEditor();
        EditorUI ui = new EditorUI(editor);
        
        ui.onCopyButtonClicked();
        ui.onPasteButtonClicked();
        ui.onDeleteButtonClicked();
        ui.onCutButtonClicked();
        
        System.out.println("\n=== Demo Complete ===");
    }
}
