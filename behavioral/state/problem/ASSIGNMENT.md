# Code Refactoring Assignment

## Problem Statement

You are given a working vending machine that handles different states (idle, processing, dispensing). The code currently works, but it has several design issues that make it difficult to add new states or modify state transitions.

## Your Task

**Refactor the existing code to improve its design, maintainability, and extensibility using appropriate design patterns.**

### Current Issues

1. **Complex State Logic**: State management uses if-else chains
2. **Hard to Extend**: Adding new states requires modifying existing code
3. **No State Objects**: States are represented as strings/enums, not objects
4. **Violation of Open/Closed Principle**: Must modify code to add states

### Requirements

1. **Maintain Functionality**: All existing functionality must continue to work
2. **Improve Design**: Apply appropriate design patterns to solve the identified issues
3. **Preserve API**: The public API should remain compatible where possible
4. **Add Documentation**: Document your refactoring decisions

---

**Note**: This is a real-world refactoring scenario. Focus on improving the design while maintaining backward compatibility.

