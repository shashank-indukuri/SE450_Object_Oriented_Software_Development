package exercise4;
/**
 * The SolutionBook class is a child class that is extended from Solution class, and implemented its own specialized method
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

import java.util.Arrays;
import java.util.List;

public class SolutionBook extends Solution{
    private String author;
    public List<String> listGenres = Arrays.asList("Tech", "Horror", "Fiction", "Humor", "Fantasy", "Drama");

    public SolutionBook(double id, String title, String author, double price, String publisher, int year, String genre) {
        super(id, title, price, publisher, year, genre);
        this.setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
