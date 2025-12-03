package com.example;

/**
 * Command for cutting text.
 */
public class CutCommand implements Command {
    private TextEditor editor;
    private String previousContent;
    private String previousClipboard;
    
    public CutCommand(TextEditor editor) {
        this.editor = editor;
    }
    
    @Override
    public void execute() {
        previousContent = editor.getContent();
        previousClipboard = editor.getClipboard();
        editor.cut();
    }
    
    @Override
    public void undo() {
        editor.setContent(previousContent);
        editor.setClipboard(previousClipboard);
        System.out.println("  -> Undo: Restored content and clipboard");
    }
}

