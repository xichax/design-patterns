package com.example;

import java.util.List;

/**
 * Iterator implementation for Lists.
 */
public class ListIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position;
    
    public ListIterator(List<T> items) {
        this.items = items;
        this.position = 0;
    }
    
    @Override
    public boolean hasNext() {
        return position < items.size();
    }
    
    @Override
    public T next() {
        if (hasNext()) {
            return items.get(position++);
        }
        throw new java.util.NoSuchElementException();
    }
}

