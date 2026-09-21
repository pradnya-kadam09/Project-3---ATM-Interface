# ATM Interface

## Description
ATM Interface is a simple Java console-based banking application. It allows a user to check their account balance, deposit money, withdraw money, or exit the ATM.

The program starts with a bank account balance of ₹10,000 and provides an interactive ATM menu.

## Technologies Used
- Java
- Scanner class
- Object-Oriented Programming (OOP)

## Classes Used

### 1. BankAccount
The `BankAccount` class manages the bank account balance.

It provides three main methods:
- `deposit()` – adds money to the account.
- `withdraw()` – withdraws money if the amount is valid and available.
- `checkBalance()` – displays the current account balance.

The account is initially created with a balance of ₹10,000.

### 2. ATM
The `ATM` class provides the ATM menu and takes input from the user.

Available options:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

### 3. ATMInterface
`ATMInterface` is the main class. It creates the `BankAccount` and `ATM` objects and starts the ATM program.

## Features
- Check current balance
- Deposit money
- Withdraw money
- Prevent invalid deposit amounts
- Prevent invalid withdrawal amounts
- Check for insufficient balance
- Exit the ATM safely
- Interactive console menu

## How the Program Works
1. A bank account is created with an initial balance of ₹10,000.
2. An ATM object is created using the bank account.
3. The ATM menu is displayed.
4. The user selects an option.
5. The selected banking operation is performed.
6. The menu continues until the user selects Exit.

## How to Run

### Using VS Code
1. Open `ATMInterface.java` in VS Code.
2. Make sure Java/JDK is installed.
3. Click the **Run** button above the `main()` method, or press `Ctrl + F5`.

### Using Terminal

Compile the program:

```bash
javac ATMInterface.java
```

Run the program:

```bash
java ATMInterface
```

## Example Output

```text
===== ATM MENU =====
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 1

Current Balance: ₹10000.0
```

## Project Structure

```text
ATMInterface/
├── ATMInterface.java
└── README.md
```

## Important
The public class is named `ATMInterface`, so the Java source file must be named:

```text
ATMInterface.java
```

## Author
Pradnya Kadam
