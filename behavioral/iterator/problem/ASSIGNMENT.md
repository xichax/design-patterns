# Code Refactoring Assignment

## Problem Statement

You are given a working collection system that stores items in different data structures (array, list, etc.). The code currently works, but it has several design issues that make it difficult to iterate over collections uniformly and add new collection types.

## Your Task

**Refactor the existing code to improve its design, maintainability, and extensibility using appropriate design patterns.**

### Current Issues

The code has the following problems:

1. **Different Iteration Logic**: Each collection type requires different iteration code
2. **Tight Coupling**: Client code is tightly coupled to specific collection implementations
3. **No Uniform Interface**: Cannot iterate over collections uniformly
4. **Hard to Extend**: Adding new collection types requires modifying client code
5. **Violation of Encapsulation**: Client code knows about internal collection structure

### Requirements

1. **Maintain Functionality**: All existing functionality must continue to work
2. **Improve Design**: Apply appropriate design patterns to solve the identified issues
3. **Preserve API**: The public API should remain compatible where possible
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

