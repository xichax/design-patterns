package com.example;

import java.util.List;

/**
 * Collection implementation using a List.
 */
public class ListCollection<T> implements Collection<T> {
    private List<T> items;
    
    public ListCollection(List<T> items) {
        this.items = items;
    }
    
    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(items);
    }
}

