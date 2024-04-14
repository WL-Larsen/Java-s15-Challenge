package com.workintech.librarymanagement;

import java.util.List;

public interface BookManagement {
    void addBook(Book book);
    Book findBookById(int id);
    List<Book> findBooksByTitle(String title);
    List<Book> findBooksByAuthor(String author);
    void updateBookInfo(int id, String newInfo);
    void removeBook(int id);
    List<Book> listBooksByCategory(String category);
    List<Book> listBooksByAuthor(String author);
}
