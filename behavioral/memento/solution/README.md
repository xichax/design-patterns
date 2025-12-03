# Memento Pattern - Solution

This folder contains the **solution** to the code refactoring assignment using the **Memento Pattern**.

## Design Pattern: Memento Pattern

### Pattern Overview

The Memento pattern provides a way to capture and restore an object's internal state without violating encapsulation.

### Components

1. **Originator (Document)**: The object whose state needs to be saved
   - Creates mementos containing snapshots of its state
   - Restores its state from mementos

2. **Memento (DocumentMemento)**: Stores the state snapshot
   - Immutable object containing the state
   - Only the Originator can access its internals

3. **Caretaker (DocumentHistory)**: Manages mementos
   - Stores and retrieves mementos
   - Never operates on or examines the contents of mementos

### How It Solves the Problems

1. **Encapsulation**: `DocumentHistory` no longer accesses `Document`'s internal state directly
2. **Loose Coupling**: `DocumentHistory` works with mementos, not document internals
3. **Extensibility**: Adding new state to `Document` only requires updating the memento, not `DocumentHistory`
4. **Maintainability**: Clear separation of concerns

### Key Changes

- `Document` now has `createMemento()` and `restoreFromMemento()` methods
- `DocumentMemento` is an inner class that encapsulates state
- `DocumentHistory` stores `DocumentMemento` objects instead of strings
- All state access is encapsulated within `Document`

## Running the Solution

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Project Structure

```
.
├── README.md
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── example
                    ├── App.java
                    ├── Document.java          # Originator
                    └── DocumentHistory.java   # Caretaker
```

