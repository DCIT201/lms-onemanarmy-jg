/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        //Creating books
       Book book1 = new Book("1984","George Orwell");
       Book book2 = new Book("To kill a Mockingbird","Harper Lee");

       //Adding books to library
  library.addBook(book1);
  library.addBook(book2);

  //Creating patrons.
  Patron patron1= new Patron("Alice",1);
  Patron patron2 = new Patron("Bob",2);

   //Adding patrons to the library
        library.addPatron(patron1);
        library.addPatron(patron2);

   //Simulating operations.
        library.checkOutBook("1984",patron1);
        library.checkOutBook("1984",patron2);  //should fail
        library.returnBook("1984");
        library.checkOutBook("1984",patron2); //should succeed
    }
}
