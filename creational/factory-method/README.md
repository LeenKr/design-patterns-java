# Factory Method Pattern

## Definition
The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate.



## Problem
In real systems, object creation logic can become complex and tightly coupled.
For example, a notification system may support Email, SMS, or Push notifications.

Adding new notification types requires modifying existing code, which makes the system hard to maintain.


## Solution
The Factory Method Pattern delegates the responsibility of object creation to subclasses.
This allows the system to be easily extended without modifying existing code.



## Real-Life Example
A notification system that sends messages using different channels:
- Email
- SMS
- Push notification

Each notification type has its own implementation, but the client code works with a common interface.

---

## When to Use
- When the exact type of object is decided at runtime
- When you want to follow the Open/Closed Principle
- When object creation logic should be centralized
