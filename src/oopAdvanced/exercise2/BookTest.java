package exercise2;
/**
 * The BookTest class implements an instances for the class Book and tries to set the genre which is not part of predefined
 * that results in warning message. Finally, prints the details of the book instance
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class BookTest {
    public static void main(String[] args) {
        System.out.println("---Book Test---");
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 30.00, "Bloomsbury",
                1997, "Fantasy");
        book1.setGenre("Magic");
        System.out.println("---Book Details---");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("Publisher: " + book1.getPublisher());
        System.out.println("Year: " + book1.getYear());
        System.out.println("Genre: " + book1.getGenre());
    }
}
