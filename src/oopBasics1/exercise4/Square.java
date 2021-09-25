package oopBasics1.exercise4;
/**
 * The Square class implements an instance variable side and performs geometric operations with the parametrized Constructor
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class Square {
    private final int SIDES_NUMBER = 4; // Constant that holds the int value
    private int side;

    /**+
     * Constructor that initialises the side instance variable
     * @param side This is the value for instance variable side
     */
    public Square(int side) {
        this.side = side;
    }

    /**
     * This method performs a perimeter of a Square
     * @return int This returns a product of 4 sides
     */
    public int perimeter() {
        return SIDES_NUMBER * side;
    }

    /**
     * This method performs an area of a Square
     * @return int This returns a product of two sides
     */
    public int area() {
        return side * side;
    }
}
