package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Collection Iterator ===\n");
        
        String[] items = {"Apple", "Banana", "Cherry"};
        System.out.println("Array items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println("  - " + items[i]);
        }
        
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");
        System.out.println("\nList items:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("  - " + list.get(i));
        }
        
        System.out.println("\n=== Demo Complete ===");
    }
}
