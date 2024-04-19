import com.workintech.librarymanagement.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {

        // LibraryContent nesnesi oluştur
        LibraryContent content = new LibraryContent();

        // Library nesnesi oluştur
        Library library = new Library(content);

        // Sisteme yeni kitap ekle
        library.addBook(new Book(1,"Gecenin Sonuna Yolculuk", "Louis-Ferdinand Céline", "Otobiyografik",300));
        library.addBook(new Book(2,"Suç ve Ceza", "Dostoyevski", "Edebiyat",120.50));
        library.addBook(new Book(3,"Sefiller", "Victor Hugo", "Edebiyat",750));
        library.addBook(new Book(4,"Ay ve Altı Peni", "W. Somerset Maugham", "Edebiyat",82));
        library.addBook(new Book(5,"Sahilde Kafka", "Haruki Murakimi", "Fantastik",300));
        library.addBook(new Book(6,"Tutunamayanlar", "Oğuz Atay", "Türk edebiyatı",350.50));
        library.addBook(new Book(7,"Yabancı", "Albert Camus", "Absürdizm",200));
        library.addBook(new Book(8,"Faust", "Goethe", "Edebiyat",300));
        library.addBook(new Book(9,"Çavdar Tarlasında Çocuklar", "J.D Salinger", "Edebiyat",300));
        library.addBook(new Book(10,"Taksitle Ölüm", "Louis-Ferdinand Céline", "Otobiyografik",300));
        library.addBook(new Book(11,"deneme", "denemee", "denemeee",300));


        //Bütün kitapları listele
        System.out.println("All books in the library:");
        List<Book> allBooks = new ArrayList<>();
        allBooks.addAll(content.booksById.values());
        for (Book book : allBooks) {
            System.out.println(book);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // id, isim veya yazar bilgisine göre bir kitap bul
        System.out.println("Book found by ID: " + library.findBookById(7));
        System.out.println("Book found by ID: " + library.findBooksByTitle("Sahilde Kafka"));
        System.out.println("Book found by ID: " + library.findBooksByAuthor("Goethe"));

        System.out.println("-----------------------------------------------------------------------------------------");

        //Kitap bilgisini güncelle
        System.out.println("Updating book information:");
        library.updateBookInfo(2,130);
        System.out.println(library.findBookById(2));

        System.out.println("-----------------------------------------------------------------------------------------");

        //Kitap sil
        System.out.println("Removing a book:");
        library.removeBook(11);
        List<Book> updatingAllBooks = new ArrayList<>();
        allBooks.addAll(content.booksById.values());
        for (Book book : allBooks) {
            System.out.println(book);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        //Kategoriye göre kitapları listele
        System.out.println("Listing books by category:");
        System.out.println(library.listBooksByCategory("Edebiyat"));

        System.out.println("-----------------------------------------------------------------------------------------");

        // Yazara göre listele
        System.out.println("Listing books by author:");
        System.out.println(library.listBooksByAuthor("Oğuz Atay"));

        System.out.println("-----------------------------------------------------------------------------------------");

        //Kullanıcı oluşutur
        User user1 = new User(1,"Gizem");
        User user2 = new User(2,"Buse");
        User user3 = new User(3,"Ali");

        //Kullanıcı Kitap ödünç alır.
        try{
            library.lendBook(new Book(11,"deneme", "denemee", "denemeee",300),user1);
            library.lendBook(new Book(10,"Taksitle Ölüm", "Louis-Ferdinand Céline", "Otobiyografik",300), user2);
        } catch (UserLimitException e) {
            System.out.println(e.getMessage());
        }

        //Kullanıcı kitabı iade eder
        library.returnBook(new Book(11,"deneme", "denemee", "denemeee",300),user1);

        //Fatura oluştur
        library.generateInvoice(new Book(11,"deneme", "denemee", "denemeee",300),user1);


    }
}