package com.example;

/**
 * Parser that builds expression trees from string expressions.
 * 
 * REFACTORED: Creates expression objects instead of directly evaluating
 */
public class ExpressionParser {
    
    /**
     * Parses a string expression into an Expression object.
     * @param expression The expression string (e.g., "5 + 3")
     * @return An Expression object representing the parsed expression
     */
    public Expression parse(String expression) {
        expression = expression.trim();
        
        // Simple parser for binary operations
        // In a real implementation, this would be more sophisticated
        if (expression.contains("+")) {
            String[] parts = expression.split("\\+");
            Expression left = parse(parts[0].trim());
            Expression right = parse(parts[1].trim());
            return new AddExpression(left, right);
        } else if (expression.contains("-")) {
            String[] parts = expression.split("-");
            Expression left = parse(parts[0].trim());
            Expression right = parse(parts[1].trim());
            return new SubtractExpression(left, right);
        } else if (expression.contains("*")) {
            String[] parts = expression.split("\\*");
            Expression left = parse(parts[0].trim());
            Expression right = parse(parts[1].trim());
            return new MultiplyExpression(left, right);
        } else if (expression.contains("/")) {
            String[] parts = expression.split("/");
            Expression left = parse(parts[0].trim());
            Expression right = parse(parts[1].trim());
            return new DivideExpression(left, right);
        } else {
            // Terminal expression - a number
            return new NumberExpression(Integer.parseInt(expression));
        }
    }
}

