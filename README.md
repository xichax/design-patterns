# Design Patterns Assignment Project

A comprehensive collection of design pattern assignments organized by pattern category. Each pattern includes both a problem statement (for students to solve) and a complete solution.

## Project Structure

```
.
├── behavioral/          # Behavioral Design Patterns
│   └── memento/
│       ├── problem/     # Assignment code with design issues
│       └── solution/    # Refactored solution using the pattern
├── structural/          # Structural Design Patterns
│   └── (patterns to be added)
└── README.md           # This file
```

## Pattern Categories

### Behavioral Patterns
Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects.

- **Memento Pattern**: Capturing and restoring object state without violating encapsulation

### Structural Patterns
Structural patterns are concerned with how classes and objects are composed to form larger structures.

- (More patterns to be added)

## How to Use This Project

### For Students (Problem Solving)

1. Navigate to the pattern's `problem` folder
2. Read the `ASSIGNMENT.md` file for the problem statement
3. Analyze the code and identify design issues
4. Refactor the code using appropriate design patterns
5. Test your solution by running the demo application

### For Instructors (Reviewing Solutions)

1. Navigate to the pattern's `solution` folder
2. Review the refactored code
3. Check the `README.md` for pattern explanation
4. Compare with student solutions

## Getting Started

Each pattern folder contains its own Maven project with:
- `pom.xml` - Maven configuration
- `src/` - Source code
- `ASSIGNMENT.md` - Problem description (in problem folder)
- `README.md` - Documentation

### Building a Pattern Project

```bash
cd behavioral/memento/problem  # or solution
mvn clean compile
```

### Running a Pattern Demo

```bash
cd behavioral/memento/problem  # or solution
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Pattern List

### Behavioral Patterns

#### Memento Pattern
- **Location**: `behavioral/memento/`
- **Problem**: Text editor with undo/redo functionality that has encapsulation and coupling issues
- **Solution**: Uses Memento pattern to encapsulate state management

## Contributing

To add a new pattern:

1. Create a new folder under `behavioral/` or `structural/`
2. Create `problem/` and `solution/` subfolders
3. Add the assignment code to `problem/`
4. Add the refactored solution to `solution/`
5. Include `ASSIGNMENT.md` in the problem folder
6. Include `README.md` in both folders
7. Add `pom.xml` for Maven builds

## License

This project is for educational purposes.
