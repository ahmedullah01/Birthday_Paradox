bilkul 👍 tum jo text chahte ho wo clean format me yeh raha:

---

# 🎂 Birthday Paradox Simulation (Java)

## 📌 Introduction

This project demonstrates the **Birthday Paradox** problem in probability theory.
The paradox states that in a group of just 23 people, there is a greater than 50% chance that **at least two people share the same birthday**.

Here, we simulate this paradox in Java by:

* Generating random birthdays for **n** members using a **Linear Congruential Generator (LCG)**.
* Checking if at least two members have the same birthday.
* Returning the result (`true/false`).

---

## 🏗 Project Structure

### Main.java

* Entry point of the program.
* Creates a `Runner` object and calls its `execute()` method.

### Runner.java

* Handles user interaction.
* Takes the number of members as input from the user.
* Calls `Probability` class to assign birthdays and check duplicates.

### Probability.java

* Core logic of the Birthday Paradox simulation.
* Stores the number of members and their assigned birthdays.
* Uses `Random_num_generator` to assign random birthdays.
* Contains the `compare()` method that checks if at least two birthdays match.

### Random\_num\_generator.java

* Implements the **Linear Congruential Generator (LCG)** algorithm:

$$
X_{n+1} = (aX_n + c) \; mod \; m
$$

**Parameters:**

* `current_X`: Seed value (starting point).
* `multiplier (a)` = 7.
* `increment (c)` = 11.
* `m = 365` (days in a year).

Generates birthdays in the range **1–365**.

---

## 🔄 Program Flow

1. User inputs the number of members (e.g., 10).
2. The program assigns each member a random birthday using the LCG.
3. The birthdays are compared pairwise.
4. If at least two members share the same birthday → **Output = true**.
   Otherwise → **Output = false**.

---

👉 ye text tum seedha apni **README.md** file ya assignment me paste kar sakte ho.

chaho to main iska ek **short summary paragraph** bhi bana du jo presentation slides me use ho sake?
