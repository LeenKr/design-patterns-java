# Observer Pattern

## Definition
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.



## Problem
In many systems, multiple components need to react to changes in another object.
Directly coupling these components leads to rigid and hard-to-maintain code.



## Solution
The Observer Pattern decouples the subject from its observers by introducing a subscription mechanism.
Observers can be added or removed dynamically at runtime.



## Real-Life Example
A stock market system where multiple clients (mobile apps, trading bots, dashboards)
need to react when the stock price changes.


## When to Use
- When multiple objects depend on another object’s state
- When you want loose coupling
- When implementing event-driven systems
