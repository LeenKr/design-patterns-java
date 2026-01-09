# Adapter Pattern

## Definition
The Adapter Pattern allows incompatible interfaces to work together by converting the interface of one class into another expected by the client.



## Problem
In real-world systems, applications often need to integrate with third-party or legacy services whose interfaces do not match the system’s expectations.

Modifying existing code is not always possible or safe.



## Solution
The Adapter Pattern introduces an adapter class that translates one interface into another, allowing the client to work with different implementations transparently.



## Real-Life Example
A payment system that integrates multiple payment providers (e.g., Stripe, PayPal, Bank API),
each having a different interface.



## When to Use
- When integrating third-party libraries
- When working with legacy systems
- When interfaces are incompatible
