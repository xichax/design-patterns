package com.example.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the undo/redo history for a Document.
 * 
 * This class stores previous states of the document to enable
 * undo and redo operations.
 * 
 * ISSUES WITH CURRENT DESIGN:
 * - Directly stores and manipulates Document's internal state (String content)
 * - Tightly coupled to Document's internal structure
 * - If Document adds more state (e.g., font, formatting), this class breaks
 * - No encapsulation of state - history manager knows too much about Document internals
 */
public class DocumentHistory {
    private List<String> undoStack;
    private List<String> redoStack;
    
    /**
     * Creates a new document history manager.
     */
    public DocumentHistory() {
        this.undoStack = new ArrayList<>();
        this.redoStack = new ArrayList<>();
    }
    
    /**
     * Saves the current state of the document.
     * Clears the redo stack since a new change is being made.
     * 
     * PROBLEM: Directly accessing Document's internal state
     * 
     * @param document The document whose state should be saved
     */
    public void save(Document document) {
        // Directly accessing and storing the document's content
        // This creates tight coupling - if Document changes, this breaks
        String currentContent = document.getContent();
        undoStack.add(currentContent);
        redoStack.clear(); // New change invalidates redo history
    }
    
    /**
     * Undoes the last change by restoring the document to the previous state.
     * 
     * PROBLEM: Directly manipulating Document's internal state
     * 
     * @param document The document to undo changes for
     * @throws IllegalStateException if undo is not possible
     */
    public void undo(Document document) {
        if (!canUndo()) {
            throw new IllegalStateException("Cannot undo: no history available");
        }
        
        // Save current state to redo stack
        String currentContent = document.getContent();
        redoStack.add(currentContent);
        
        // Remove current state from undo stack (it's the last one)
        undoStack.remove(undoStack.size() - 1);
        
        // Restore previous state (now the last one in undo stack)
        // This violates encapsulation - DocumentHistory shouldn't know how to modify Document
        if (!undoStack.isEmpty()) {
            String previousContent = undoStack.get(undoStack.size() - 1);
            document.setContent(previousContent);
        } else {
            // No more history, restore to empty
            document.setContent("");
        }
    }
    
    /**
     * Redoes the last undone change.
     * 
     * PROBLEM: Same issues as undo - direct state manipulation
     * 
     * @param document The document to redo changes for
     * @throws IllegalStateException if redo is not possible
     */
    public void redo(Document document) {
        if (!canRedo()) {
            throw new IllegalStateException("Cannot redo: no redo history available");
        }
        
        // Save current state to undo stack
        String currentContent = document.getContent();
        undoStack.add(currentContent);
        
        // Restore forward state from redo stack
        // This violates encapsulation - DocumentHistory shouldn't know how to modify Document
        String nextContent = redoStack.remove(redoStack.size() - 1);
        document.setContent(nextContent);
        undoStack.add(nextContent); // Add the restored state to undo stack
    }
    
    /**
     * Checks if undo operation is available.
     * @return true if undo is possible, false otherwise
     */
    public boolean canUndo() {
        return !undoStack.isEmpty();
    }
    
    /**
     * Checks if redo operation is available.
     * @return true if redo is possible, false otherwise
     */
    public boolean canRedo() {
        return !redoStack.isEmpty();
    }
    
    /**
     * Clears all history (both undo and redo stacks).
     */
    public void clear() {
        undoStack.clear();
        redoStack.clear();
    }
    
    /**
     * Gets the number of available undo operations.
     * @return The size of the undo stack
     */
    public int getUndoCount() {
        return undoStack.size();
    }
    
    /**
     * Gets the number of available redo operations.
     * @return The size of the redo stack
     */
    public int getRedoCount() {
        return redoStack.size();
    }
}

