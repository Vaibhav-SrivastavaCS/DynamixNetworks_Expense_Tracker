package com.expense.tracker.service;

import com.expense.tracker.model.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {

    private final List<Transaction> transactions = new ArrayList<>();

    public void addIncome(double amount, String category) {
        Transaction transaction = new Transaction(
                amount,
                category,
                "INCOME",
                LocalDate.now()
        );
        transactions.add(transaction);
        System.out.println("Income added successfully.");
    }

    public void addExpense(double amount, String category) {
        Transaction transaction = new Transaction(
                amount,
                category,
                "EXPENSE",
                LocalDate.now()
        );
        transactions.add(transaction);
        System.out.println("Expense added successfully.");
    }

    public void viewAllTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        System.out.println("\n----- Transaction History -----");
        for (Transaction t : transactions) {
            System.out.println(
                    t.getDate() + " | " +
                            t.getType() + " | " +
                            t.getCategory() + " | ₹" +
                            t.getAmount()
            );
        }
    }
}
