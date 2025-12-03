# Code Refactoring Assignment

## Problem Statement

You are given a working text editor application with undo/redo functionality. The code currently works, but it has several design issues that make it difficult to maintain, extend, and test.

## Your Task

**Refactor the existing code to improve its design, maintainability, and extensibility using appropriate design patterns.**

### Current Issues

The code has the following problems:

1. **Poor Encapsulation**: The `DocumentHistory` class directly accesses and manipulates the internal state of `Document`
2. **Tight Coupling**: `DocumentHistory` is tightly coupled to `Document`'s internal structure
3. **State Management**: History management is mixed with document logic
4. **Extensibility**: Adding new state properties or different types of documents would require changes in multiple places

### Requirements

1. **Maintain Functionality**: All existing functionality must continue to work
2. **Improve Design**: Apply appropriate design patterns to solve the identified issues
3. **Preserve API**: The public API of `Document` and `DocumentHistory` should remain compatible (same method signatures)
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

