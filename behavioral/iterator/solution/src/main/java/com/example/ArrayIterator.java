package com.example;

/**
 * Iterator implementation for arrays.
 */
public class ArrayIterator<T> implements Iterator<T> {
    private T[] items;
    private int position;
    
    public ArrayIterator(T[] items) {
        this.items = items;
        this.position = 0;
    }
    
    @Override
    public boolean hasNext() {
        return position < items.length;
    }
    
    @Override
    public T next() {
        if (hasNext()) {
            return items[position++];
        }
        throw new java.util.NoSuchElementException();
    }
}

