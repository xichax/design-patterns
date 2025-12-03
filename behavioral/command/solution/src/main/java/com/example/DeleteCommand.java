package com.example;

/**
 * Command for deleting text.
 */
public class DeleteCommand implements Command {
    private TextEditor editor;
    private String previousContent;
    private char deletedChar;
    
    public DeleteCommand(TextEditor editor) {
        this.editor = editor;
    }
    
    @Override
    public void execute() {
        previousContent = editor.getContent();
        if (!previousContent.isEmpty()) {
            deletedChar = previousContent.charAt(previousContent.length() - 1);
        }
        editor.delete();
    }
    
    @Override
    public void undo() {
        editor.setContent(previousContent);
        System.out.println("  -> Undo: Restored content to '" + previousContent + "'");
    }
}

