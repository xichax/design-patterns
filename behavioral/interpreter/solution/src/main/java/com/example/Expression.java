package com.example;

/**
 * Abstract expression interface.
 * 
 * REFACTORED: Uses Interpreter pattern
 * - Each expression type is represented as an object
 * - Expressions can be composed to form complex expressions
 * - Easy to add new expression types without modifying existing code
 * 
 * Design Pattern: Interpreter Pattern
 * - AbstractExpression: Defines the interpret operation
 * - TerminalExpression: Represents terminal symbols (numbers)
 * - NonTerminalExpression: Represents grammar rules (operations)
 */
public interface Expression {
    /**
     * Interprets and evaluates the expression.
     * @return The result of the evaluation
     */
    int interpret();
}

