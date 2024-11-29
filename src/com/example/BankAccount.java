package com.example;

public class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance can't be negative. Setting balance to 0.");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the current balance
    public double getBalance() {
        return balance;
    }

    // Method to get the account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }
}
