package oopBasics1.exercise1;
/**
 * The Square class implements an instance variable side and performs geometric operations
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class Square {
    public int side;

    /**
     * This method performs a perimeter of a Square
     * @return int This returns a product of 4 sides
     */
    public int perimeter() {
        return 4 * side;
    }

    /**
     * This method performs an area of a Square
     * @return int This returns a product of two sides
     */
    public int area() {
        return side * side;
    }
}
