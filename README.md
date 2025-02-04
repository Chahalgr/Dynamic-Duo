# Dynamic Array-Based Stack and Queue Implementation

## Overview

This project showcases an implementation of dynamic data structures, specifically **Stack** and **Queue**, using a custom **DynArray** class in Java. It demonstrates core data structure concepts, including array resizing (dynamic growth and shrinkage), stack operations (LIFO), and queue operations (FIFO).

The project is structured to provide efficient storage management while allowing for flexible insertion and removal of elements.

---

## Features

### 1. **Dynamic Array (`DynArray`)**
   - Automatically resizes as elements are added or removed.
   - Supports the following operations:
     - `insert()`: Adds elements to the array.
     - `remove()`: Removes elements, adjusting the array size.
     - `grow()`: Doubles the array size when capacity is reached.
     - `shrink()`: Reduces the array size when utilization drops below 50%.
     - Accessor methods (`at(int index)`, `printArray()`).

### 2. **Stack Implementation**
   - Extends the `DynArray` class.
   - Operations:
     - `push(double value)`: Adds a value to the top of the stack.
     - `pop()`: Removes and returns the value at the top of the stack.
     - `stackDump()`: Displays the contents of the stack.
     - `isEmpty()`: Checks if the stack is empty.

### 3. **Queue Implementation**
   - Extends the `DynArray` class.
   - Operations:
     - `que(double value)`: Enqueues a value at the end of the queue.
     - `deQue()`: Dequeues and returns the value at the front of the queue.
     - `queueDump()`: Displays the contents of the queue.
     - `isEmpty()`: Checks if the queue is empty.

### 4. **Driver Program (`StackQueueDriver`)**
   - Demonstrates the usage of both the stack and queue.
   - Fills, displays, and empties both data structures.
   - Provides real-time output for key operations (e.g., push, pop, enqueue, dequeue).

---

## Code Structure

- `DynArray.java`: Core dynamic array implementation.
- `Stack.java`: Stack implementation extending `DynArray`.
- `Queue.java`: Queue implementation extending `DynArray`.
- `StackQueueDriver.java`: Main driver program to test and demonstrate stack and queue operations.

