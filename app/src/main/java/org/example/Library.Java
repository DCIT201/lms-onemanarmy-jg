
import java.util.ArrayList;
import java.util.List;
public class Library {
private List<Book> books;
private List<Patron> patrons;

public Library() {
    this.books = new ArrayList< >();
    this.patrons = new ArrayList< >();
}
     public void addBook(Book book) {
    books.add(book);
     }
public void addPatron(Patron patron) {
    patrons.add(patron);
}
public boolean checkOutBook(String title, Patron patron) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title) &&book.isAvailable()){
            book.setAvailable(false);
            System.out.println(patron.getName() + " checked out " + title);
            return true;
        }
    }
System.out.println(title + " is not available for checkout.");
    return false;
}
public void returnBook(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            book.setAvailable(true);
            System.out.println(title + "has been returned.");
            return;
        }
    }
    System.out.println(title + "does not belong to this library");
}
}
