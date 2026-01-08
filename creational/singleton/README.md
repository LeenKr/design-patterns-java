# Singleton Pattern

## Definition
The Singleton Pattern ensures that a class has **only one instance** and provides a **global access point** to that instance.



## Problem
In some situations, having more than one instance of a class can cause problems.
For example:
- Multiple database connections
- Multiple configuration managers
- Multiple loggers

Creating more than one instance may lead to inconsistent behavior.



## Solution
The Singleton Pattern:
- Makes the constructor **private**
- Creates a single static instance of the class
- Provides a public method to access that instance

This guarantees that only one object is created.


## When to Use
- When exactly one instance of a class is required
- When a shared resource must be controlled
- When global access to an object is needed

---

## Example
This example demonstrates a simple Singleton implementation in Java.
This example demonstrates a simple Singleton implementation in Java.

