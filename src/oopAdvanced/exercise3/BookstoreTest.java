package exercise3;
/**
 * The BookstoreTest class implements two instances for the class Book and tries to add them to same bookCase which have
 * different genres that results in warning message. Finally, it tries to add same bookcase multiple time to the bookstore
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class BookstoreTest {
    public static void main(String[] args) {
        System.out.println("---Bookstore Test---");
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 30.00, "Bloomsbury",
                1997, "Fantasy");

        Book book2 = new Book("It", "Stephen King", 25.00, "HarperCollins",
                1986, "Horror");

        // Trying to add two different genre books to same bookcase
        Bookcase bookCase1 = new Bookcase("Fantasy");
        bookCase1.addBook(book1);
        bookCase1.addBook(book2);

        // Adding a new book to different bookcase
        Bookcase bookCase2 = new Bookcase("Drama");
        bookCase2.setGenre("Horror");
        bookCase2.addBook(book2);

        //Trying to add two similar genre bookcase to bookStore which results in warning message
        Bookstore bookStore = new Bookstore();
        bookStore.addBookcase(bookCase1);
        bookStore.addBookcase(bookCase1);
    }
}
