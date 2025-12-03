package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Expression Evaluator ===\n");
        
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        
        System.out.println("Evaluating expressions:\n");
        System.out.println("5 + 3 = " + evaluator.evaluate("5 + 3"));
        System.out.println("10 - 4 = " + evaluator.evaluate("10 - 4"));
        System.out.println("6 * 2 = " + evaluator.evaluate("6 * 2"));
        System.out.println("15 / 3 = " + evaluator.evaluate("15 / 3"));
        
        System.out.println("\n=== Demo Complete ===");
    }
}
