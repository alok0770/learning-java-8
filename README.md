# ⚡ Java 8 Functional Programming Laboratory

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java%208+-0969DA?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 8+"/>
  <img src="https://img.shields.io/badge/Paradigm-Functional%20Programming-00E5FF?style=for-the-badge&logo=java&logoColor=black" alt="Functional Programming"/>
  <img src="https://img.shields.io/badge/Package-java.util.function-FFA116?style=for-the-badge" alt="java.util.function"/>
  <img src="https://img.shields.io/badge/Status-Hands--on%20Reference-2EA44F?style=for-the-badge" alt="Reference"/>
</p>

---

## 📖 Overview

A dedicated code repository and reference laboratory for mastering **Java 8 Functional Programming**. 

Moving beyond traditional imperative Java, this repository covers the shift to **declarative, concise, and clean code** through hands-on implementations of Lambda Expressions, Single Abstract Method (SAM) contracts, and the complete `java.util.function` standard library.

---

## 📂 Core Modules & Architecture

```
src/
├── lambda/                 # Lambda syntax, Runnable, Comparator, and lexical scope
├── functionalInterface/   # SAM contract, @FunctionalInterface, and interface inheritance
├── function/              # Built-in functional interfaces (Predicate, Function, Consumer, Supplier)
└── calculator/            # Lambda-driven arithmetic dispatch engine
```

---

## 🔬 Topic Breakdown

### 1. ⚡ Lambda Expressions (`src/lambda/`)
Replacing verbose anonymous inner classes with concise lambda syntax and understanding runtime behavior:
- **Syntax & Execution**: `LambdaDemo.java` — Core lambda syntax and parameter inference.
- **Multithreading**: `LambdaRunnableDemo.java` — Implementing `java.lang.Runnable` with zero boilerplate.
- **Sorting & Comparators**: `LambdaComparatorDemo.java`, `ComparatorString.java` — Custom collection sorting via inline lambda comparator definitions.
- **Scope & `this` Context**: `ThisDemo.java` — Demonstrating lexical scoping differences: how `this` refers to the enclosing class in a lambda vs. the instance in an anonymous class.

---

### 2. 🧩 Custom Functional Interfaces (`src/functionalInterface/`)
Rules governing interfaces designed for lambda execution:
- **SAM Principle**: `MyInterface.java`, `FunctionalInterfaceDemo.java` — Single Abstract Method constraints and `@FunctionalInterface` validation.
- **Inheritance Semantics**: `Parent.java`, `Child.java`, `FunctionalInterfaceInheritance.java` — Rules for extending functional interfaces, overriding SAMs, and preserving functional contracts.

---

### 3. 🛠️ Predefined Functional Interfaces (`src/function/`)
Comprehensive coverage of the `java.util.function` package:

| Interface | Method Signature | Purpose | Implemented In |
| :--- | :--- | :--- | :--- |
| **`Predicate<T>`** | `boolean test(T t)` | Conditional evaluations & filtering logic | `PredicateDemo.java` |
| **`Function<T, R>`** | `R apply(T t)` | Input-to-output data transformation | `FunctionsDemo.java` |
| **`Consumer<T>`** | `void accept(T t)` | Side-effect execution without return | `ConsumerDemo.java` |
| **`Supplier<T>`** | `T get()` | Lazy value generation / factory supplier | `SupplierDemo.java` |
| **`BiPredicate<T, U>`** | `boolean test(T t, U u)` | Two-argument boolean condition | `BiInterfacesDemo.java` |
| **`BiFunction<T, U, R>`** | `R apply(T t, U u)` | Two-argument data transformation | `BiInterfacesDemo.java` |
| **`BiConsumer<T, U>`** | `void accept(T t, U u)` | Two-argument consumer operation | `BiInterfacesDemo.java` |
| **`UnaryOperator<T>`** | `T apply(T t)` | Transformation where input & output types match | `UnaryBinaryOperatorDemo.java` |
| **`BinaryOperator<T>`** | `T apply(T t1, T t2)`| Two arguments reduced to single result of same type | `UnaryBinaryOperatorDemo.java` |

#### Function Chaining (`FunctionChaining.java`)
- Demonstrates pipeline composition using `.andThen()` (sequential execution) and `.compose()` (reversed precedence).

---

### 4. 🧮 Lambda Calculator Engine (`src/calculator/`)
- `Calculator.java` & `Operations.java`: Practical demonstration using functional interfaces as first-class citizens to perform dynamic arithmetic operations (+, -, *, /) without conditional `switch` statements.

---

## 🏃 How to Compile & Run

Any program can be compiled and executed directly from the terminal:

```bash
# Clone the repository
git clone https://github.com/alok0770/learning-java-8.git
cd learning-java-8

# Compile a specific file (e.g. FunctionChaining)
javac -d out src/function/FunctionChaining.java

# Run the compiled class
java -cp out function.FunctionChaining
```

---

## 👨‍💻 Author

**Alok Rana**  
- 🐙 GitHub: [@alok0770](https://github.com/alok0770)  
- 🌐 Portfolio: [portfolio-alok-2b96.vercel.app](https://portfolio-alok-2b96.vercel.app/)  
- 💼 LeetCode: [@Alok_0770](https://leetcode.com/u/Alok_0770/)  
