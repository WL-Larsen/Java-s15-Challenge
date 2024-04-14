package com.workintech.librarymanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryContent {
    private Map<Integer, Book>  booksById;
    private Map<String, List<Book>> booksByTitle;
    private Map<String, List<Book>> booksByAuthor;
    private Map<String, List<Book>> booksByCategory;


    public LibraryContent() {
        booksById = new HashMap<>();
        booksByTitle = new HashMap<>();
        booksByAuthor = new HashMap<>();
        booksByCategory = new HashMap<>();
    }


    public void addBooks(Book book){
    };

    public Book findBookById(int id){
        return null;
    }


    public List<Book> findBooksByTitle(String title) {
        // Implementation
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        // Implementation
        return null;
    }

    public void updateBookInfo(int id, String newInfo) {
        // Implementation
    }

    public void removeBook(int id) {
        // Implementation
    }

    public List<Book> listBooksByCategory(String category) {
        // Implementation
        return null;
    }

    public List<Book> listBooksByAuthor(String author) {
        // Implementation
        return null;
    }

}
