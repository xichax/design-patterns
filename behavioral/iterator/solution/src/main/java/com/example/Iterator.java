package com.example;

/**
 * Iterator interface for traversing collections.
 * 
 * REFACTORED: Uses Iterator pattern
 * - Provides a uniform way to access elements of a collection
 * - Decouples iteration logic from collection implementation
 * - Allows multiple iterations over the same collection
 * 
 * Design Pattern: Iterator Pattern
 * - Iterator: Defines interface for accessing elements
 * - ConcreteIterator: Implements iteration for specific collection
 * - Aggregate: Defines interface for creating iterators
 * - ConcreteAggregate: Implements collection and creates iterators
 */
public interface Iterator<T> {
    /**
     * Checks if there are more elements.
     * @return true if there are more elements, false otherwise
     */
    boolean hasNext();
    
    /**
     * Returns the next element.
     * @return The next element
     */
    T next();
}

