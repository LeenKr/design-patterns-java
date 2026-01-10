# Decorator Pattern

## Definition
The Decorator Pattern allows behavior to be added to individual objects dynamically without affecting the behavior of other objects of the same class.



## Problem
In real-world applications, objects often require optional features such as logging, security, or validation.
Creating subclasses for every possible combination leads to class explosion.



## Solution
The Decorator Pattern wraps objects with additional behavior while keeping the same interface.
This allows features to be stacked dynamically at runtime.


## Real-Life Example
A notification system where features such as logging and encryption can be added dynamically to email notifications.


## When to Use
- When behavior needs to be added dynamically
- When subclassing becomes impractical
- When extending functionality without modifying existing code
