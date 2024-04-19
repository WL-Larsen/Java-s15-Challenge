package com.workintech.librarymanagement;

import java.util.List;

interface BookManagement {
    void addBook(Book book); // Kitap eklemek için metot
    Book findBookById(int id); // ID ile kitap bulmak için metot
    List<Book> findBooksByTitle(String title); // Başlık ile kitapları bulmak için metot
    List<Book> findBooksByAuthor(String author); // Yazar ile kitapları bulmak için metot
    void updateBookInfo(int id, double newInfo); // Kitap bilgilerini güncellemek için metot
    void removeBook(int id); // Kitap silmek için metot
    List<Book> listBooksByCategory(String category); // Kategoriye göre kitapları listelemek için metot
    List<Book> listBooksByAuthor(String author); // Yazarına göre kitapları listelemek için metot
}