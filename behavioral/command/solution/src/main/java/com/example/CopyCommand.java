package com.example;

/**
 * Command for copying text.
 */
public class CopyCommand implements Command {
    private TextEditor editor;
    private String previousClipboard;
    
    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }
    
    @Override
    public void execute() {
        previousClipboard = editor.getClipboard();
        editor.copy();
    }
    
    @Override
    public void undo() {
        editor.setClipboard(previousClipboard);
        System.out.println("  -> Undo: Restored clipboard");
    }
}

