package com.workintech.librarymanagement;

import java.util.Set;

public class User {

    private String userId;
    private String name;
    private Set<Book> borrowedBooks;

    public User(String userId, String name, Set<Book> borrowedBooks) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Set<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    // Kitap ödünç alma ve geri verme metotları gelecek

}
