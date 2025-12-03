# Code Refactoring Assignment

This folder contains a **code refactoring assignment** where you're given working code with design issues that need to be improved using appropriate design patterns.

## Assignment Details

See [ASSIGNMENT.md](ASSIGNMENT.md) for the complete problem statement and requirements.

## Overview

You are given a working text editor application with undo/redo functionality. The code works, but has several design problems:

- Poor encapsulation
- Tight coupling between classes
- Direct state manipulation
- Difficult to extend or maintain

**Your task**: Refactor the code to improve its design using appropriate design patterns while maintaining all existing functionality.

## Project Structure

```
.
├── ASSIGNMENT.md          # Complete assignment description
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               ├── App.java                    # Demo application
    │               ├── Document.java                # Document class (needs refactoring)
    │               └── DocumentHistory.java         # History manager (needs refactoring)
```

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Building the Project

```bash
mvn clean compile
```

## Running the Application

```bash
mvn exec:java -Dexec.mainClass="com.example.App"
```

Or compile and run manually:

```bash
mvn clean package
java -cp target/*.jar com.example.App
```

## Getting Started

1. Read the code in `src/main/java/com/example/`
2. Identify the design issues (hints are in the code comments)
3. Refactor using appropriate design patterns
4. Run the demo application to verify functionality: `mvn exec:java -Dexec.mainClass="com.example.App"`
5. Document your design decisions

Good luck!

