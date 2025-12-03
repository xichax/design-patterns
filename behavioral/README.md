# Behavioral Design Patterns

This folder contains assignments for **Behavioral Design Patterns**.

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. They describe not just patterns of objects or classes but also the patterns of communication between them.

## Patterns

### Chain of Responsibility Pattern

- **Location**: `chain-of-responsibility/`
- **Problem**: Support ticket processor with long if-else chains for handling different priorities
- **Solution**: Uses Chain of Responsibility pattern to create a chain of handlers

### Command Pattern

- **Location**: `command/`
- **Problem**: Text editor with tight coupling between UI and editor operations
- **Solution**: Uses Command pattern to encapsulate operations and enable undo/redo

### Interpreter Pattern

- **Location**: `interpreter/`
- **Problem**: Expression evaluator with complex parsing logic and hard-to-extend structure
- **Solution**: Uses Interpreter pattern to represent expressions as objects

### Iterator Pattern

- **Location**: `iterator/`
- **Problem**: Collections with different iteration logic requiring client code changes
- **Solution**: Uses Iterator pattern to provide uniform iteration interface

### Mediator Pattern

- **Location**: `mediator/`
- **Problem**: Chat application with tight coupling between users
- **Solution**: Uses Mediator pattern to centralize communication

### Memento Pattern

- **Location**: `memento/`
- **Problem**: Text editor with undo/redo functionality that has encapsulation and coupling issues
- **Solution**: Uses Memento pattern to encapsulate state management

### Observer Pattern

- **Location**: `observer/`
- **Problem**: Weather station with tight coupling to display components
- **Solution**: Uses Observer pattern to decouple subject and observers

### State Pattern

- **Location**: `state/`
- **Problem**: Vending machine with complex state management using if-else chains
- **Solution**: Uses State pattern to represent states as objects

### Strategy Pattern

- **Location**: `strategy/`
- **Problem**: Payment processor with complex conditional logic for different payment methods
- **Solution**: Uses Strategy pattern to encapsulate payment algorithms

### Template Method Pattern

- **Location**: `template-method/`
- **Problem**: Data processors with code duplication across different data types
- **Solution**: Uses Template Method pattern to define algorithm skeleton

### Visitor Pattern

- **Location**: `visitor/`
- **Problem**: Document system where operations are mixed with element classes
- **Solution**: Uses Visitor pattern to separate operations from element structure

## Examples of Behavioral Patterns

- **Chain of Responsibility**: Passes requests along a chain of handlers
- **Command Pattern**: Encapsulates requests as objects
- **Interpreter Pattern**: Implements a specialized language
- **Iterator Pattern**: Provides a way to access elements sequentially
- **Mediator Pattern**: Defines how objects interact
- **Memento Pattern**: Captures and restores object state
- **Observer Pattern**: Notifies multiple objects about state changes
- **State Pattern**: Allows an object to alter its behavior when its internal state changes
- **Strategy Pattern**: Defines a family of algorithms
- **Template Method**: Defines the skeleton of an algorithm
- **Visitor Pattern**: Separates algorithms from object structure

## Structure

Each pattern folder follows this structure:

```
pattern-name/
├── problem/          # Assignment code with design issues
│   ├── ASSIGNMENT.md
│   ├── README.md
│   ├── pom.xml
│   └── src/
└── solution/         # Refactored solution
    ├── README.md
    ├── pom.xml
    └── src/
```
