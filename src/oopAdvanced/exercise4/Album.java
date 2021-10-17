package exercise4;
/**
 * The Album class implements an instance variables with predefined genres.
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

import java.util.Arrays;
import java.util.List;

public class Album {
    private double id;
    private String title;
    private String artist;
    private double price;
    private String publisher;
    private int year;
    private String genre;
    private final String[] DEFINED_GENRES= {"Pop", "Rock", "Jazz", "Folk", "Country", "Classical"};
    public List<String> listGenres = Arrays.asList(DEFINED_GENRES);

    public Album(double id, String title, String artist, double price, String publisher, int year, String genre){
        this.setId(id);
        this.setTitle(title);
        this.setArtist(artist);
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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

    /**+
     * This method initializes the value of genre within the predefined genres
     * @param genre This is the value for the instance variable genre that needs to be set
     */
    public void setGenre(String genre) {
        if (listGenres.contains(genre)) {
            this.genre = genre;
        } else {
            System.out.println("Genre is not existed, Please refer the available Genres");
            System.out.println(listGenres);
        }
    }
}
