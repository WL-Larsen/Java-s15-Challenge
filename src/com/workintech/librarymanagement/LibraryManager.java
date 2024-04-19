package com.workintech.librarymanagement;

import java.util.HashMap;
import java.util.Map;

public class LibraryManager {
    private LibraryContent content;
    private Map<Book, User> borrowedBooks;

    public LibraryManager(LibraryContent content) {
        this.content = content;
        this.borrowedBooks = new HashMap<>();
    }


    public void lendBook(Book book, User user) throws UserLimitException {
        if (user.getBorrowedBooks().size() >= 5){
            throw new UserLimitException("User has reached the borrowing limit.");
        }
        if (book.isAvailable()){
            book.setAvailable(false);
            borrowedBooks.put(book, user);
            user.getBorrowedBooks().add(book);
            System.out.println("Book successfully borrowed by user: " + user.getName());
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(Book book, User user){
        if (borrowedBooks.containsKey(book) && borrowedBooks.get(book).equals(user)){
            book.setAvailable(true);
            borrowedBooks.remove(book);
            user.getBorrowedBooks().remove(book);
            System.out.println("Book successfully returned by user: " + user.getName());
        }else {
            System.out.println("Book return failed. Either the book is not borrowed by this user or it was not found.");
        }
    }

    public void generateInvoice(Book book, User user){
        Invoice invoice = new Invoice(book, user);
        System.out.println("Invoice generated:" + invoice);
    }

    @Override
    public String toString() {
        return "LibraryManager{" +
                "content=" + content +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
