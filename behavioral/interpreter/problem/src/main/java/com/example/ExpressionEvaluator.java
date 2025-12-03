package com.example;

public class ExpressionEvaluator {
    
    public int evaluate(String expression) {
        expression = expression.trim();
        
        if (expression.contains("+")) {
            String[] parts = expression.split("\\+");
            int left = Integer.parseInt(parts[0].trim());
            int right = Integer.parseInt(parts[1].trim());
            return left + right;
        } else if (expression.contains("-")) {
            String[] parts = expression.split("-");
            int left = Integer.parseInt(parts[0].trim());
            int right = Integer.parseInt(parts[1].trim());
            return left - right;
        } else if (expression.contains("*")) {
            String[] parts = expression.split("\\*");
            int left = Integer.parseInt(parts[0].trim());
            int right = Integer.parseInt(parts[1].trim());
            return left * right;
        } else if (expression.contains("/")) {
            String[] parts = expression.split("/");
            int left = Integer.parseInt(parts[0].trim());
            int right = Integer.parseInt(parts[1].trim());
            if (right == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return left / right;
        } else {
            return Integer.parseInt(expression.trim());
        }
    }
}
