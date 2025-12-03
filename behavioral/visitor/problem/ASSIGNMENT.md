# Code Refactoring Assignment

## Problem Statement

You are given a working document system that processes different types of elements (text, images, tables). The code currently works, but it has several design issues when adding new operations on these elements.

## Your Task

**Refactor the existing code to improve its design, maintainability, and extensibility using appropriate design patterns.**

### Current Issues

1. **Operations in Element Classes**: Each operation is implemented in element classes
2. **Hard to Add Operations**: Adding new operations requires modifying all element classes
3. **Violation of Open/Closed Principle**: Must modify code to add operations
4. **Mixed Concerns**: Elements contain both data and operation logic

### Requirements

1. **Maintain Functionality**: All existing functionality must continue to work
2. **Improve Design**: Apply appropriate design patterns to solve the identified issues
3. **Preserve API**: The public API should remain compatible where possible
4. **Add Documentation**: Document your refactoring decisions

---

**Note**: This is a real-world refactoring scenario. Focus on improving the design while maintaining backward compatibility.

