package com.example;

import java.util.Scanner;
import com.example.BankAccount; // Import BankAccount class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a new bank account
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        
        BankAccount account = new BankAccount(name, initialDeposit);
        System.out.println("Account created for " + account.getAccountHolder() + " with balance: $" + account.getBalance());
        
        // Main menu for user interaction
        boolean running = true;
        while (running) {
            System.out.println("\n1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
