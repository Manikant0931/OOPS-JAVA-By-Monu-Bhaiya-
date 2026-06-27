# Java OOP's

A hands-on Java project covering core Object-Oriented Programming concepts, Data Structures, and Design Patterns — organized into focused modules for step-by-step learning.

---

## Project Structure

```
├── final_dance_IN_O.../       # Miscellaneous / experimental code
├── oops_abstractor/           # Abstraction, Interfaces, Generics, DSA
├── oops_basic/                # Basic OOP fundamentals
├── oops_constructor/          # Constructors in Java
├── oops_inheritance/          # Inheritance concepts
```

---

## Modules

### oops_basic
Foundational OOP concepts — the starting point.

| File | Description |
|------|-------------|
| `Main.java` | Entry point / driver class |
| `Student.java` | Basic class with fields and methods |

---

### oops_constructor
Covers constructor types, constructor chaining, and object initialization.

| File | Description |
|------|-------------|
| `Car.java` | Car class with constructor examples |
| `car_client.java` | Client to test Car constructors |

---

### oops_inheritance
Demonstrates parent-child class relationships and method overriding.

| File | Description |
|------|-------------|
| `parent.java` | Base/parent class |
| `child.java` | Subclass extending parent |
| `inheri_client.java` | Client to test inheritance |

---

### oops_abstractor
Advanced OOP topics — abstraction, interfaces, generics, enums, DSA, and design patterns.

| File | Description |
|------|-------------|
| `Abstract_Client.java` | Demo for abstract classes |
| `Class_for_Interfa...java` | Class implementing an interface |
| `Client_Class.java` | General client/driver |
| `DSAI.java` | Data Structures & Algorithms implementation |
| `Dynamic_Interface.java` | Dynamic interface usage |
| `Final_Class_Demo.java` | `final` keyword with classes |
| `Genrics.java` | Java Generics examples |
| `LinkedList_Client.java` | LinkedList operations client |
| `LinkedList.java` | Custom LinkedList implementation |
| `Month.java` | Enum example using months |
| `Non_Final_Class.java` | Non-final class behavior |
| `Pair_Client.java` | Client for Pair class |
| `Pair.java` | Generic Pair implementation |
| `Payment_Method.java` | Interface/enum for payment types |
| `Stack_Class.java` | Stack data structure |
| `Stackj.java` | Stack using Java Collections |
| `Upi_PayMent.java` | UPI payment class demo |

---

### final_dance_IN_O.../
Additional standalone files for comparison and sorting demos.

| File | Description |
|------|-------------|
| `BUSYMAN.java` | Misc demo class |
| `CarCompareterColor.java` | Comparator by car color |
| `CarCompareterP...java` | Comparator by car price |
| `CarCompareterS...java` | Comparator by car speed |
| `Cars.java` | Cars model class |
| `CarsClient.java` | Client for Cars comparators |

---

## Concepts Covered

- Classes, Objects, and Constructors
- Inheritance and Method Overriding
- Abstract Classes and Interfaces
- `final` keyword (classes, methods, variables)
- Generics
- Enums
- Comparator and Comparable
- Data Structures — LinkedList, Stack
- Payment Interface design pattern

---

## How to Run

```bash
# Compile a file
javac oops_basic/Main.java

# Run the compiled class
java oops_basic.Main
```

Make sure you have JDK 8+ installed.

---

## Notes

- `.class` files are compiled bytecode — do not edit them manually.
- Each module is self-contained and can be studied independently.
- Start with `oops_basic` then `oops_constructor` then `oops_inheritance` then `oops_abstractor` for a structured learning path.
