package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the undo/redo history for a Document.
 * 
 * REFACTORED: Now uses the Memento pattern to store document states.
 * This class no longer needs to know about Document's internal structure.
 * 
 * Design Pattern: Memento Pattern
 * - Document (Originator): Creates and restores mementos
 * - DocumentMemento (Memento): Stores the state snapshot
 * - DocumentHistory (Caretaker): Manages mementos without knowing their structure
 * 
 * Benefits:
 * - Encapsulation: DocumentHistory doesn't access Document's internals
 * - Loose Coupling: Can add new state to Document without changing DocumentHistory
 * - Extensibility: Easy to support different document types
 */
public class DocumentHistory {
    private List<Document.DocumentMemento> undoStack;
    private List<Document.DocumentMemento> redoStack;
    
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
     * REFACTORED: Uses memento pattern - Document creates its own memento
     * 
     * @param document The document whose state should be saved
     */
    public void save(Document document) {
        // Document creates its own memento - we don't need to know its structure
        Document.DocumentMemento memento = document.createMemento();
        undoStack.add(memento);
        redoStack.clear(); // New change invalidates redo history
    }
    
    /**
     * Undoes the last change by restoring the document to the previous state.
     * 
     * REFACTORED: Document restores itself from memento - we don't manipulate its state
     * 
     * @param document The document to undo changes for
     * @throws IllegalStateException if undo is not possible
     */
    public void undo(Document document) {
        if (!canUndo()) {
            throw new IllegalStateException("Cannot undo: no history available");
        }
        
        // Save current state to redo stack
        Document.DocumentMemento currentMemento = document.createMemento();
        redoStack.add(currentMemento);
        
        // Remove current state from undo stack (it's the last one)
        undoStack.remove(undoStack.size() - 1);
        
        // Restore previous state (now the last one in undo stack)
        // Document handles its own restoration - we just provide the memento
        if (!undoStack.isEmpty()) {
            Document.DocumentMemento previousMemento = undoStack.get(undoStack.size() - 1);
            document.restoreFromMemento(previousMemento);
        } else {
            // No more history, restore to empty by setting content directly
            document.setContent("");
        }
    }
    
    /**
     * Redoes the last undone change.
     * 
     * REFACTORED: Document restores itself from memento
     * 
     * @param document The document to redo changes for
     * @throws IllegalStateException if redo is not possible
     */
    public void redo(Document document) {
        if (!canRedo()) {
            throw new IllegalStateException("Cannot redo: no redo history available");
        }
        
        // Save current state to undo stack
        Document.DocumentMemento currentMemento = document.createMemento();
        undoStack.add(currentMemento);
        
        // Restore forward state from redo stack
        // Document handles its own restoration - we just provide the memento
        Document.DocumentMemento nextMemento = redoStack.remove(redoStack.size() - 1);
        document.restoreFromMemento(nextMemento);
    }
    
    /**
     * Checks if undo operation is available.
     * @return true if undo is possible, false otherwise
     */
    public boolean canUndo() {
        return undoStack.size() > 1; // Need at least 2 states (current + previous)
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
     * @return The size of the undo stack minus 1 (current state)
     */
    public int getUndoCount() {
        return Math.max(0, undoStack.size() - 1);
    }
    
    /**
     * Gets the number of available redo operations.
     * @return The size of the redo stack
     */
    public int getRedoCount() {
        return redoStack.size();
    }
}

