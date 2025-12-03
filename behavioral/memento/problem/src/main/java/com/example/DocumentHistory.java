package com.example;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    private List<String> undoStack;
    private List<String> redoStack;
    
    public DocumentHistory() {
        this.undoStack = new ArrayList<>();
        this.redoStack = new ArrayList<>();
    }
    
    public void save(Document document) {
        String currentContent = document.getContent();
        undoStack.add(currentContent);
        redoStack.clear();
    }
    
    public void undo(Document document) {
        if (!canUndo()) {
            throw new IllegalStateException("Cannot undo: no history available");
        }
        
        String currentContent = document.getContent();
        redoStack.add(currentContent);
        
        undoStack.remove(undoStack.size() - 1);
        
        if (!undoStack.isEmpty()) {
            String previousContent = undoStack.get(undoStack.size() - 1);
            document.setContent(previousContent);
        } else {
            document.setContent("");
        }
    }
    
    public void redo(Document document) {
        if (!canRedo()) {
            throw new IllegalStateException("Cannot redo: no redo history available");
        }
        
        String currentContent = document.getContent();
        undoStack.add(currentContent);
        
        String nextContent = redoStack.remove(redoStack.size() - 1);
        document.setContent(nextContent);
        undoStack.add(nextContent);
    }
    
    public boolean canUndo() {
        return !undoStack.isEmpty();
    }
    
    public boolean canRedo() {
        return !redoStack.isEmpty();
    }
    
    public void clear() {
        undoStack.clear();
        redoStack.clear();
    }
    
    public int getUndoCount() {
        return undoStack.size();
    }
    
    public int getRedoCount() {
        return redoStack.size();
    }
}
