package com.workintech.librarymanagement;

import java.util.Objects;

public class Invoice {
    private static int count = 0;
    private int invoiceId;
    private Book book;
    private User user;
    private double amount;

    public Invoice(Book book, User user) {
        this.invoiceId = count++;
        this.book = book;
        this.user = user;
        this.amount = book.getPrice();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Invoice.count = count;
    }

    public int getInvoiceID() {
        return invoiceId;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceId = invoiceID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return invoiceId == invoice.invoiceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceID=" + invoiceId +
                ", book=" + book +
                ", user=" + user +
                ", amount=" + amount +
                '}';
    }
}
