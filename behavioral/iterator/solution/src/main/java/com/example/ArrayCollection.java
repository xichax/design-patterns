package com.example;

/**
 * Collection implementation using an array.
 */
public class ArrayCollection<T> implements Collection<T> {
    private T[] items;
    
    public ArrayCollection(T[] items) {
        this.items = items;
    }
    
    @Override
    public Iterator<T> createIterator() {
        return new ArrayIterator<>(items);
    }
}

