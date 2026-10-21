# Strategy Pattern — Calculator

## Overview

This project demonstrates the **Strategy Design Pattern** using a simple calculator implemented in Java.

The calculator supports four arithmetic operations: addition, subtraction, multiplication, and division. Each operation is implemented as a separate strategy, allowing the calculation algorithm to be changed at runtime without modifying the `Calculator` class.

## Technologies

- Java 17
- IntelliJ IDEA
- Git and GitHub
- Strategy Design Pattern

## Project Structure

```text
src/
├── CalculationStrategy.java
├── PlusStrategy.java
├── MinusStrategy.java
├── MultiplyStrategy.java
├── DivideStrategy.java
├── Calculator.java
└── Main.java
```

## Design Pattern Implementation

The project contains the following components:

- **CalculationStrategy** — an interface that defines the `calculate()` method.
- **PlusStrategy** — implements addition.
- **MinusStrategy** — implements subtraction.
- **MultiplyStrategy** — implements multiplication.
- **DivideStrategy** — implements division.
- **Calculator** — the context class that stores a strategy and delegates calculations to it.
- **Main** — the client class that reads user input and selects the appropriate strategy.

The `Calculator` class depends on the `CalculationStrategy` interface rather than specific implementations. Its strategy can be changed at runtime using the `setStrategy()` method.

## Supported Operations

| Operation | Strategy | Example |
|---|---|---|
| Addition (`+`) | `PlusStrategy` | `5 + 3 = 8` |
| Subtraction (`-`) | `MinusStrategy` | `5 - 3 = 2` |
| Multiplication (`*`) | `MultiplyStrategy` | `5 * 3 = 15` |
| Division (`/`) | `DivideStrategy` | `6 / 3 = 2` |

Division by zero is checked by the client before the division strategy is executed.

## How to Run

1. Install JDK 17 or a compatible Java development environment.
2. Clone or download this repository.
3. Open the project in IntelliJ IDEA.
4. Make sure all Java source files are included in the project.
5. Run `Main.java`.
6. Enter two numbers and select an arithmetic operation.

## Example

```text
Please enter first number:
10
Please enter second number:
5
Please enter operation(+ - / *):
*
50.0
```

## Advantages of the Implementation

- Each arithmetic operation has its own strategy class.
- New calculation algorithms can be added without changing the internal calculation logic of `Calculator`.
- The strategy can be replaced at runtime.
- The implementation follows the principle of programming to an interface.
- The responsibilities of the client, context, and strategies are separated.

## Author

**Student:** Abdraissov Altair 

**Course:** SE-2528 - Software Design Patterns  


## Repository

[GitHub Repository](https://github.com/asadigamr132/Assigment_5_SDP)
