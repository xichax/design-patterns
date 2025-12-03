package com.example;

/**
 * Collection interface that can create iterators.
 * 
 * REFACTORED: Aggregate interface in Iterator pattern
 */
public interface Collection<T> {
    /**
     * Creates an iterator for this collection.
     * @return An iterator for traversing the collection
     */
    Iterator<T> createIterator();
}

