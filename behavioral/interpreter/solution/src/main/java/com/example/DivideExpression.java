package com.example;

/**
 * Non-terminal expression representing division.
 */
public class DivideExpression implements Expression {
    private Expression left;
    private Expression right;
    
    public DivideExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int interpret() {
        int rightValue = right.interpret();
        if (rightValue == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return left.interpret() / rightValue;
    }
}

