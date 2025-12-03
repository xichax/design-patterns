package com.example;

/**
 * Demo application showing collection iteration with Iterator pattern.
 * 
 * This demonstrates the refactored implementation using the Iterator pattern.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== Collection Iterator (Iterator Pattern) ===\n");
        
        // Array collection
        String[] items = {"Apple", "Banana", "Cherry"};
        Collection<String> arrayCollection = new ArrayCollection<>(items);
        System.out.println("Array items:");
        iterateCollection(arrayCollection);
        
        // List collection
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");
        Collection<String> listCollection = new ListCollection<>(list);
        System.out.println("\nList items:");
        iterateCollection(listCollection);
        
        System.out.println("\n=== Demo Complete ===");
    }
    
    private static <T> void iterateCollection(Collection<T> collection) {
        Iterator<T> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println("  - " + iterator.next());
        }
    }
}

