package com.example.memento;

/**
 * Represents a text document with undo/redo functionality.
 * 
 * This class stores document content and provides methods to
 * modify and retrieve the content.
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
     * Gets the internal content field directly.
     * This method exposes internal state - consider if this is necessary.
     * @return The content string
     */
    public String getContentInternal() {
        return content;
    }

    
}

