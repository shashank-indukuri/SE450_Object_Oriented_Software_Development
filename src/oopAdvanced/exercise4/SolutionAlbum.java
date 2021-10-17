package exercise4;
/**
 * The SolutionAlbum class is a child class that is extended from Solution class, and implemented its own specialized method
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

import java.util.Arrays;
import java.util.List;

public class SolutionAlbum extends Solution{
    private String artist;
    public List<String> listGenres = Arrays.asList("Pop", "Rock", "Jazz", "Folk", "Country", "Classical");
    public SolutionAlbum(double id, String title, String artist, double price, String publisher, int year, String genre) {
        super(id, title, price, publisher, year, genre);
        this.setArtist(artist);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
