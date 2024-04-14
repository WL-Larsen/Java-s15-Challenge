package com.workintech.librarymanagement;

import java.util.List;

public class Library implements BookManagement{
    private LibraryContent content;
    private  LibraryManager transactionManager;

    public Library(LibraryContent content) {
        this.content = new LibraryContent();
        this.transactionManager = new LibraryManager(content);
    }

    @Override
    public void addBook(Book book) {
        content.addBooks(book);
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
    public void updateBookInfo(int id, String newInfo) {
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
    
}