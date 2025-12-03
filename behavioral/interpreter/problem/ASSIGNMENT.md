# Code Refactoring Assignment

## Problem Statement

You are given a working simple expression evaluator that can parse and evaluate basic mathematical expressions. The code currently works, but it has several design issues that make it difficult to maintain, extend, and add new expression types.

## Your Task

**Refactor the existing code to improve its design, maintainability, and extensibility using appropriate design patterns.**

### Current Issues

The code has the following problems:

1. **Complex Parsing Logic**: All parsing logic is in one method with nested conditionals
2. **Hard to Extend**: Adding new expression types requires modifying existing code
3. **No Expression Hierarchy**: Expressions are not represented as objects
4. **Violation of Open/Closed Principle**: Must modify code to add new expression types
5. **Difficult to Test**: Cannot test individual expression types in isolation

### Requirements

1. **Maintain Functionality**: All existing functionality must continue to work
2. **Improve Design**: Apply appropriate design patterns to solve the identified issues
3. **Preserve API**: The public API should remain compatible (same method signatures for main entry point)
4. **Add Documentation**: Document your refactoring decisions

### What to Deliver

1. Refactored code that addresses the design issues
2. A brief explanation (in comments or separate document) of:
   - Which design pattern(s) you used
   - Why you chose that pattern
   - How it solves the problems

### Evaluation Criteria

- Design Quality: Appropriate use of design patterns
- Code Quality: Clean, readable, well-documented code
- Problem Solving: Effectively addresses the identified issues
- Functionality: The demo application (`App.java`) should work correctly after refactoring

---

**Note**: This is a real-world refactoring scenario. Focus on improving the design while maintaining backward compatibility.

