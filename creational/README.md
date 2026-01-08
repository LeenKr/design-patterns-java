# Creational Design Patterns

Creational design patterns focus on **object creation mechanisms**.
They help make a system independent of how its objects are created, composed, and represented.

Instead of creating objects directly using `new`, creational patterns provide **flexible and controlled ways** to create objects.

---

## Why Creational Patterns?

In large systems:
- Object creation logic can become complex
- Tight coupling makes code hard to maintain
- Changing object creation may break existing code

Creational patterns solve these problems by:
- Encapsulating object creation
- Improving flexibility and reusability
- Supporting clean architecture principles


## Common Creational Patterns

- **Singleton** – Ensures a class has only one instance
- **Factory Method** – Creates objects without specifying the exact class
- **Abstract Factory** – Creates families of related objects
- **Builder** – Constructs complex objects step by step
- **Prototype** – Creates objects by cloning existing ones


## Repository Structure

Each pattern is organized in its own folder and includes:
- A clear definition
- Problem and solution explanation
- Simple Java example
- UML diagram

Example:

creational/
├── singleton/
│ ├── README.md
│ └── SingletonExample.java



## Goal of This Section

The goal is not only to implement patterns,
but to **understand when and why to use them** in real-world software design.

The examples in this section are implemented in Java using simple, clear code for learning purposes.

