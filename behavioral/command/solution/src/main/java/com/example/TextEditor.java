package com.example;

/**
 * Represents a text editor with various operations.
 * 
 * REFACTORED: Now acts as the Receiver in the Command pattern.
 * Operations are invoked through commands, not directly.
 */
public class TextEditor {
    private String content;
    private String clipboard;
    
    public TextEditor() {
        this.content = "Hello World";
        this.clipboard = "";
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getClipboard() {
        return clipboard;
    }
    
    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
    
    public void copy() {
        System.out.println("Copying text...");
        clipboard = content.substring(0, Math.min(5, content.length()));
        System.out.println("  -> Copied: '" + clipboard + "'");
    }
    
    public void paste() {
        System.out.println("Pasting text...");
        content += clipboard;
        System.out.println("  -> Content: '" + content + "'");
    }
    
    public void delete() {
        System.out.println("Deleting text...");
        if (!content.isEmpty()) {
            content = content.substring(0, content.length() - 1);
        }
        System.out.println("  -> Content: '" + content + "'");
    }
    
    public void cut() {
        System.out.println("Cutting text...");
        clipboard = content.substring(0, Math.min(5, content.length()));
        content = content.substring(Math.min(5, content.length()));
        System.out.println("  -> Cut: '" + clipboard + "'");
        System.out.println("  -> Content: '" + content + "'");
    }
}

