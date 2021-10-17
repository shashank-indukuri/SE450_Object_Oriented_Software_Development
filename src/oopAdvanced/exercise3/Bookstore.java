package exercise3;
/**
 * The Bookstore class implements the Bookcase instance based on specific bookcase per genre.
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

import java.util.Hashtable;

public class Bookstore {

    private Hashtable<String, Bookcase> bookStore = new Hashtable<String, Bookcase>();

    /**+
     * This method adds the bookCase to the bookStore if it is unique per genre else returns a warning message
     * @param bookCase This is the Bookcase instance
     */
    public void addBookcase(Bookcase bookCase) {
        if (!bookStore.containsKey(bookCase.getGenre())) {
            bookStore.put(bookCase.getGenre(), bookCase);
            System.out.println("Successfully added a bookcase " + bookCase.getGenre() + " to the store.");
        } else {
            System.out.println("The bookcase for this genre " + bookCase.getGenre() + " already exists. Try other genre bookcase.");
        }
    }
}
