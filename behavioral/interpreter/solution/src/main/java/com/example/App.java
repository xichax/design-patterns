package com.example;

/**
 * Demo application showing the expression evaluator.
 * 
 * This demonstrates the refactored implementation using the Interpreter pattern.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== Expression Evaluator (Interpreter Pattern) ===\n");
        
        ExpressionParser parser = new ExpressionParser();
        
        System.out.println("Evaluating expressions:\n");
        
        Expression expr1 = parser.parse("5 + 3");
        System.out.println("5 + 3 = " + expr1.interpret());
        
        Expression expr2 = parser.parse("10 - 4");
        System.out.println("10 - 4 = " + expr2.interpret());
        
        Expression expr3 = parser.parse("6 * 2");
        System.out.println("6 * 2 = " + expr3.interpret());
        
        Expression expr4 = parser.parse("15 / 3");
        System.out.println("15 / 3 = " + expr4.interpret());
        
        System.out.println("\n=== Demo Complete ===");
    }
}

