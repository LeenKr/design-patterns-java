# Strategy Pattern

## Definition
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
The algorithm can vary independently from the clients that use it.



## Problem
Applications often need to support multiple ways of performing an operation (e.g., payments, sorting, pricing).
Embedding this logic using conditionals leads to rigid and hard-to-maintain code.



## Solution
The Strategy Pattern extracts each algorithm into its own class and allows the client to choose the strategy at runtime.



## Real-Life Example
A payment system that supports multiple payment methods such as credit card, PayPal, and bank transfer.



## When to Use
- When you have multiple ways to perform an action
- When you want to avoid conditional logic
- When algorithms need to change at runtime
