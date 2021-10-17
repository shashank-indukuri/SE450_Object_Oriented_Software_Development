package exercise4;
/**
 * The Solution class is a generalized class that can as a parent
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

import java.util.Arrays;
import java.util.List;

public class Solution {
    private double id;
    private String title;
    private double price;
    private String publisher;
    private int year;
    private String genre;
    public List<String> listGenres = Arrays.asList("Pop", "Rock", "Jazz", "Folk", "Country", "Classical");

    public Solution(double id, String title, double price, String publisher, int year, String genre){
        this.setId(id);
        this.setTitle(title);
        this.setPrice(price);
        this.setPublisher(publisher);
        this.setYear(year);
        this.setGenre(genre);
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (listGenres.contains(genre)) {
            this.genre = genre;
        } else {
            System.out.println("Genre is not existed, Please refer the available Genres");
            System.out.println(listGenres);
        }
    }
}
