import java.util.Scanner;

// Bank Account class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully!");
            System.out.println("Deposited Amount: ₹" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash.");
            System.out.println("Withdrawn Amount: ₹" + amount);
        }
    }

    // Balance check method
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// ATM class
class ATM {
    private final BankAccount account;
    private final Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    // ATM menu
    public void start() {
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
switch (choice) {
    case 1 -> account.checkBalance();

    case 2 -> {
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }

    case 3 -> {
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }

    case 4 -> System.out.println("Thank you for using the ATM!");

    default -> System.out.println("Invalid choice! Please try again.");
}

        } while (choice != 4);

        scanner.close();
    }
}

// Main class
public class ATMInterface {
    public static void main(String[] args) {

        // Creating bank account object
        BankAccount account = new BankAccount(10000);

        // Creating ATM object
        ATM atm = new ATM(account);

        // Starting ATM
        atm.start();
    }
}