package com.example;

/**
 * Represents a text document with undo/redo functionality.
 * 
 * This class stores document content and provides methods to
 * modify and retrieve the content.
 * 
 * REFACTORED: Now implements the Memento pattern by creating
 * and restoring memento objects instead of exposing internal state.
 */
public class Document {
    private String content;
    
    /**
     * Creates a new empty document.
     */
    public Document() {
        this.content = "";
    }
    
    /**
     * Creates a new document with the specified content.
     * @param content Initial content of the document
     */
    public Document(String content) {
        this.content = content != null ? content : "";
    }
    
    /**
     * Sets the content of the document.
     * @param content The new content
     */
    public void setContent(String content) {
        this.content = content != null ? content : "";
    }
    
    /**
     * Gets the current content of the document.
     * @return The current content
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Creates a memento containing the current state of the document.
     * This method encapsulates the state creation, so DocumentHistory
     * doesn't need to know about Document's internal structure.
     * 
     * @return A memento object containing the current state
     */
    public DocumentMemento createMemento() {
        return new DocumentMemento(this.content);
    }
    
    /**
     * Restores the document state from a memento.
     * This method encapsulates the state restoration, maintaining
     * proper encapsulation.
     * 
     * @param memento The memento containing the state to restore
     */
    public void restoreFromMemento(DocumentMemento memento) {
        if (memento != null) {
            this.content = memento.getContent();
        }
    }
    
    /**
     * Memento class that stores the document's state.
     * This is an inner class to keep the memento implementation
     * private to the Document class.
     */
    public static class DocumentMemento {
        private final String content;
        
        /**
         * Creates a new memento with the specified content.
         * Package-private constructor - only Document can create mementos.
         */
        DocumentMemento(String content) {
            this.content = content != null ? content : "";
        }
        
        /**
         * Gets the content stored in this memento.
         * Package-private method - only Document can access memento internals.
         */
        String getContent() {
            return content;
        }
    }
}

