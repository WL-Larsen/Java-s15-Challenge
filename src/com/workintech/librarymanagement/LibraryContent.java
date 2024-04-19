package com.workintech.librarymanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryContent {
    public Map<Integer, Book> booksById;
    private Map<String, List<Book>> booksByTitle;
    private Map<String, List<Book>> booksByAuthor;
    private Map<String, List<Book>> booksByCategory;

    public LibraryContent() {
        booksById = new HashMap<>();
        booksByTitle = new HashMap<>();
        booksByAuthor = new HashMap<>();
        booksByCategory = new HashMap<>();
    }

    public void addBook(Book book) {
        // Kitap ekleme işlemi
        booksById.put(book.getId(), book);
        booksByTitle.computeIfAbsent(book.getTitle(), k -> new ArrayList<>()).add(book);
        booksByAuthor.computeIfAbsent(book.getAuthor(), k -> new ArrayList<>()).add(book);
        booksByCategory.computeIfAbsent(book.getCategory(), k -> new ArrayList<>()).add(book);
    }

    public Book findBookById(int id) {
        // ID ile kitap bulma işlemi
        return booksById.get(id);
    }

    public List<Book> findBooksByTitle(String title) {
        // Başlık ile kitapları bulma işlemi
        return booksByTitle.getOrDefault(title, new ArrayList<>());
    }

    public List<Book> findBooksByAuthor(String author) {
        // Yazar ile kitapları bulma işlemi
        return booksByAuthor.getOrDefault(author, new ArrayList<>());
    }

    public void updateBookInfo(int id, double newInfo) {
        // Kitap bilgilerini güncelleme işlemi
        Book book = booksById.get(id);
        if (book != null) {
            book.setPrice(newInfo); // Örnek olarak yazar bilgisini güncelliyoruz
        }
    }

    public void removeBook(int id) {
        // Kitap silme işlemi
        Book removedBook = booksById.remove(id);
        if (removedBook != null) {
            booksByTitle.get(removedBook.getTitle()).remove(removedBook);
            booksByAuthor.get(removedBook.getAuthor()).remove(removedBook);
            booksByCategory.get(removedBook.getCategory()).remove(removedBook);
        }
    }

    public List<Book> listBooksByCategory(String category) {
        // Kategoriye göre kitapları listeleme işlemi
        return booksByCategory.getOrDefault(category, new ArrayList<>());
    }

    public List<Book> listBooksByAuthor(String author) {
        // Yazarına göre kitapları listeleme işlemi
        return booksByAuthor.getOrDefault(author, new ArrayList<>());
    }

    @Override
    public String toString() {
        return "LibraryContent{" +
                "booksById=" + booksById +
                ", booksByTitle=" + booksByTitle +
                ", booksByAuthor=" + booksByAuthor +
                ", booksByCategory=" + booksByCategory +
                '}';
    }
}
