package com.example;

/**
 * Command interface that encapsulates a request as an object.
 * 
 * REFACTORED: Uses Command pattern
 * - Encapsulates requests as objects
 * - Allows parameterizing clients with different requests
 * - Enables undo/redo, queuing, logging, and macro operations
 * 
 * Design Pattern: Command Pattern
 * - Command: Encapsulates a request as an object
 * - Invoker: Calls the command
 * - Receiver: Performs the actual operation
 */
public interface Command {
    /**
     * Executes the command.
     */
    void execute();
    
    /**
     * Undoes the command (if supported).
     */
    void undo();
}

