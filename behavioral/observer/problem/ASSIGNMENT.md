# Code Refactoring Assignment

## Problem Statement

You are given a working weather station that broadcasts temperature updates. The code currently works, but it has several design issues that make it difficult to add new display types or modify existing ones.

## Your Task

**Refactor the existing code to improve its design, maintainability, and extensibility using appropriate design patterns.**

### Current Issues

1. **Tight Coupling**: Weather station directly calls display methods
2. **Hard to Extend**: Adding new displays requires modifying the weather station
3. **No Dynamic Subscription**: Cannot add or remove displays at runtime
4. **Violation of Open/Closed Principle**: Must modify code to add new observers

### Requirements

1. **Maintain Functionality**: All existing functionality must continue to work
2. **Improve Design**: Apply appropriate design patterns to solve the identified issues
3. **Preserve API**: The public API should remain compatible where possible
4. **Add Documentation**: Document your refactoring decisions

---

**Note**: This is a real-world refactoring scenario. Focus on improving the design while maintaining backward compatibility.

