package com.example;

/**
 * Command for pasting text.
 */
public class PasteCommand implements Command {
    private TextEditor editor;
    private String previousContent;
    private String clipboardContent;
    
    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }
    
    @Override
    public void execute() {
        previousContent = editor.getContent();
        clipboardContent = editor.getClipboard();
        editor.paste();
    }
    
    @Override
    public void undo() {
        editor.setContent(previousContent);
        System.out.println("  -> Undo: Restored content to '" + previousContent + "'");
    }
}

