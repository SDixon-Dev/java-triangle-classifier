# Triangle Classifier (Java)

A Java programming task demonstrating **object-oriented programming (OOP)** concepts through the implementation of two interacting classes. The project classifies triangles as **Equilateral**, **Isosceles**, or **Scalene** based on the lengths of their three sides.

This task demonstrates constructors, encapsulation, object interaction, conditional logic and method decomposition in Java.

---

## Overview

The program models a triangle by storing the lengths of its three sides in a dedicated `Triangle` class.

A separate `TriangleSolver` class analyses the side lengths and determines the triangle's classification.

The solver compares the three sides and returns one of the following triangle types:

- Equilateral
- Isosceles
- Scalene

The project separates data storage from processing logic, demonstrating a common object-oriented design principle.

---

## Features

- Create a triangle using three side lengths.
- Store triangle dimensions using a dedicated `Triangle` class.
- Retrieve and modify side lengths using getters and setters.
- Classify triangles as Equilateral, Isosceles or Scalene.
- Compare floating-point values using a dedicated comparison method.
- Demonstrate interaction between multiple classes.

---

## Triangle Classification

The triangle type is determined using the following rules:

### Equilateral

All three sides are equal.

```
Side A = Side B = Side C
```

Example:

```
3, 3, 3

Result: Equilateral
```

---

### Isosceles

Exactly two sides are equal.

```
Side A = Side B
or
Side A = Side C
or
Side B = Side C
```

Example:

```
5, 5, 3

Result: Isosceles
```

---

### Scalene

All three sides are different.

```
Side A ≠ Side B ≠ Side C
```

Example:

```
3, 4, 5

Result: Scalene
```

---

## Technologies

- Java
- Eclipse IDE
- Object-Oriented Programming (OOP)

---

### Files

| File | Description |
|------|-------------|
| Triangle.java | Stores the three side lengths of a triangle |
| TriangleSolver.java | Determines the triangle classification |
| TriangleTest.java | Custom test program |

---

## Example Output

```text
TRIANGLE RECOGNITION TESTS
----------------------------------------

Test 1: Equilateral triangle
Result: PASSED

Test 2: Isosceles triangle where A equals B
Result: PASSED

Test 3: Isosceles triangle where A equals C
Result: PASSED

Test 4: Isosceles triangle where B equals C
Result: PASSED

Test 5: Scalene triangle
Result: PASSED

Test 6: Equilateral triangle using decimal values
Result: PASSED

Testing complete.
```

---

## Object-Oriented Concepts Demonstrated

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- Object Interaction
- Method Decomposition
- Conditional Logic
- Boolean Methods

---

## Author

Sean Dixon
