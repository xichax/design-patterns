package com.example;

public class EditorUI {
    private TextEditor editor;
    
    public EditorUI(TextEditor editor) {
        this.editor = editor;
    }
    
    public void onCopyButtonClicked() {
        editor.copy();
    }
    
    public void onPasteButtonClicked() {
        editor.paste();
    }
    
    public void onDeleteButtonClicked() {
        editor.delete();
    }
    
    public void onCutButtonClicked() {
        editor.cut();
    }
}
