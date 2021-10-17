package exercise3;
/**
 * The Bookcase class adds the Book instances to it based on genre.
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

import java.util.ArrayList;

public class Bookcase {
    private String genre;
    private ArrayList<Book> bookCase = new ArrayList<>();

    public Bookcase(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**+
     * This method adds the book to the specific bookcase where it belongs to else returns a warning message
     * @param book This is the Book instance
     */
    public void addBook(Book book) {
        if(this.genre == book.getGenre()) {
            bookCase.add(book);
            System.out.println("Successfully added a book " + book.getTitle() + " to the bookcase.");
        } else {
            System.out.println("This Book " + book.getTitle() +" cannot be added to this current bookcase. Try other bookcase with same genre.");
        }
    }
}
