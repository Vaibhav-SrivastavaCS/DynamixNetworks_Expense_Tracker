package com.expense.tracker;

import com.expense.tracker.service.ExpenseService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseService service = new ExpenseService();

        while (true) {
            System.out.println("\n===== Expense Tracker Menu =====");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    service.addIncome(amount, category);
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    service.addExpense(amount, category);
                }
                case 3 -> service.viewAllTransactions();
                case 4 -> {
                    System.out.println("Thank you for using Expense Tracker!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
