package com.example;

/**
 * Demo application showing the text editor with Command pattern.
 * 
 * This demonstrates the refactored implementation using the Command pattern.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== Text Editor (Command Pattern) ===\n");
        
        TextEditor editor = new TextEditor();
        CommandHistory history = new CommandHistory();
        EditorUI ui = new EditorUI(history);
        
        // Create commands
        Command copyCommand = new CopyCommand(editor);
        Command pasteCommand = new PasteCommand(editor);
        Command deleteCommand = new DeleteCommand(editor);
        Command cutCommand = new CutCommand(editor);
        
        // Simulate user interactions
        ui.setCopyCommand(copyCommand);
        ui.setPasteCommand(pasteCommand);
        ui.setDeleteCommand(deleteCommand);
        ui.setCutCommand(cutCommand);
        
        ui.onCopyButtonClicked();
        ui.onPasteButtonClicked();
        ui.onDeleteButtonClicked();
        ui.onCutButtonClicked();
        
        // Demonstrate undo functionality
        System.out.println("\n--- Undo Operations ---");
        history.undo();
        history.undo();
        
        System.out.println("\n=== Demo Complete ===");
    }
}

