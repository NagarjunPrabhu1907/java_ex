package java_programs;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountInfo() {
        return "Account Number: " + accountNumber + "\nAccount Holder: " + accountHolder + "\nBalance: $" + balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Banking System!");
        System.out.print("Enter your name: ");
        String accountHolder = input.nextLine();
        System.out.print("Enter an account number: ");
        String accountNumber = input.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountHolder);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Account Information:\n" + account.getAccountInfo());
                    break;
                case 4:
                    System.out.println("Thank you for using our Banking System!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

