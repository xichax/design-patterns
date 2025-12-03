package com.example;

public class Document {
    private String content;
    
    public Document() {
        this.content = "";
    }
    
    public Document(String content) {
        this.content = content != null ? content : "";
    }
    
    public void setContent(String content) {
        this.content = content != null ? content : "";
    }
    
    public String getContent() {
        return content;
    }
    
    public String getContentInternal() {
        return content;
    }
}
