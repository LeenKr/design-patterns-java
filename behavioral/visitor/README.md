# Visitor Pattern

## Definition
The Visitor Pattern lets you define new operations on a set of objects
without changing the classes of those objects.


## Problem
In systems with complex object structures, adding new operations
requires modifying multiple classes, which breaks maintainability.



## Solution
The Visitor Pattern moves the operation logic into a separate visitor class.
Objects accept visitors and delegate the operation to them.



## Real-Life Example
An e-commerce system where different item types
(physical, digital, services) need tax and discount calculations.



## When to Use
- When object structure is stable
- When new operations are added frequently
- When you want to keep business logic separate
