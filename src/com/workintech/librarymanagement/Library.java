package com.workintech.librarymanagement;

import java.util.List;

public class Library implements BookManagement {
    private LibraryContent content;
    private LibraryManager manager;

    public Library(LibraryContent content) {
        this.content = content;
        this.manager = new LibraryManager(content);
    }

    @Override
    public void addBook(Book book) {
        content.addBook(book);
    }

    @Override
    public Book findBookById(int id) {
        return content.findBookById(id);
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        return content.findBooksByTitle(title);
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return content.findBooksByAuthor(author);
    }

    @Override
    public void updateBookInfo(int id, double newInfo) {
        content.updateBookInfo(id, newInfo);
    }

    @Override
    public void removeBook(int id) {
        content.removeBook(id);
    }

    @Override
    public List<Book> listBooksByCategory(String category) {
        return content.listBooksByCategory(category);
    }

    @Override
    public List<Book> listBooksByAuthor(String author) {
        return content.listBooksByAuthor(author);
    }

    public void lendBook(Book book, User user) throws UserLimitException {
        manager.lendBook(book, user);
    }

    public void returnBook(Book book, User user) {
        manager.returnBook(book, user);
    }

    public void generateInvoice(Book book, User user) {
        manager.generateInvoice(book, user);
    }

    @Override
    public String toString() {
        return "Library{" +
                "content=" + content +
                ", manager=" + manager +
                '}';
    }
}