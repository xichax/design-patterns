package com.example;

import java.util.Stack;

/**
 * Manages command history for undo/redo functionality.
 * 
 * REFACTORED: Acts as the Invoker in the Command pattern.
 * Stores and manages command execution history.
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();
    
    /**
     * Executes a command and adds it to history.
     * @param command The command to execute
     */
    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }
    
    /**
     * Undoes the last command.
     */
    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        } else {
            System.out.println("  -> Nothing to undo");
        }
    }
}

