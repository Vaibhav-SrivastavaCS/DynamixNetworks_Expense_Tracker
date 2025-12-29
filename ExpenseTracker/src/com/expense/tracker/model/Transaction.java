package com.expense.tracker.model;

import java.time.LocalDate;

public class Transaction {

    private double amount;
    private String category;
    private String type; // INCOME or EXPENSE
    private LocalDate date;

    public Transaction(double amount, String category, String type, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.type = type;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }
}
