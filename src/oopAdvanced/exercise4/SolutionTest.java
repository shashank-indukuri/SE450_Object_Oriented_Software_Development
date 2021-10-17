package exercise4;
/**
 * The SolutionTest class creates instances of book and album class and set's price of book and the genre in album.
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("---Inheritance Test---");
        SolutionBook book1 = new SolutionBook(123,"Harry Potter", "J.K. Rowling", 30.00, "Bloomsbury",
                1997, "Fantasy");

        SolutionAlbum album1 = new SolutionAlbum(456, "Wavin' Flag", "K'NAAN", 15.00, "Sheet music.oWorld Cup anthem",
                2009, "Rock");

        book1.setPrice(50.00);
        album1.setGenre("Pop");
    }
}
