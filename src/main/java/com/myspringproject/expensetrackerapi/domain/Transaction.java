package com.myspringproject.expensetrackerapi.domain;

public class Transaction {

    private Integer transactionId;
    private Integer userId;
    private Integer categoryId;
    private String note;
    private double amount;
    private long transactionDate;

    public Transaction(Integer transactionId, Integer userId, Integer categoryId, String note, double amount, long transactionDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.categoryId = categoryId;
        this.note = note;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(long transactionDate) {
        this.transactionDate = transactionDate;
    }
}
