package com.example;

/**
 * UI component for the text editor.
 * 
 * REFACTORED: Now works with commands instead of directly calling editor methods.
 * This decouples the UI from the editor implementation.
 */
public class EditorUI {
    private CommandHistory history;
    private Command copyCommand;
    private Command pasteCommand;
    private Command deleteCommand;
    private Command cutCommand;
    
    public EditorUI(CommandHistory history) {
        this.history = history;
    }
    
    public void setCopyCommand(Command command) {
        this.copyCommand = command;
    }
    
    public void setPasteCommand(Command command) {
        this.pasteCommand = command;
    }
    
    public void setDeleteCommand(Command command) {
        this.deleteCommand = command;
    }
    
    public void setCutCommand(Command command) {
        this.cutCommand = command;
    }
    
    /**
     * REFACTORED: Now executes commands instead of calling editor directly
     * This allows for undo/redo, logging, queuing, etc.
     */
    public void onCopyButtonClicked() {
        if (copyCommand != null) {
            history.executeCommand(copyCommand);
        }
    }
    
    public void onPasteButtonClicked() {
        if (pasteCommand != null) {
            history.executeCommand(pasteCommand);
        }
    }
    
    public void onDeleteButtonClicked() {
        if (deleteCommand != null) {
            history.executeCommand(deleteCommand);
        }
    }
    
    public void onCutButtonClicked() {
        if (cutCommand != null) {
            history.executeCommand(cutCommand);
        }
    }
}

