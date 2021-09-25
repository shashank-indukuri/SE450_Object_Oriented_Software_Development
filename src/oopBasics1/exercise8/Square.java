package oopBasics1.exercise8;
/**
 * The Square class implements an instance variable side and performs geometric operations with the parametrized Constructor
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class Square {
    private final int SIDES_NUMBER = 4;
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

    /**
     * This method prints the details of a Square using getDetails() method
     */
    public void printDetails() {
        System.out.println(this.getDetails());
    }

    /**
     * This method gets all the details of a Square
     * @return String This returns a single string with details
     */
    public String getDetails() {
        String details = "Details of a Square: \n";
        details += "Length of a Square is " + this.side + "\n";
        details += "Perimeter of a Square is " + this.perimeter() + "\n";
        details += "Area of a Square is " + this.area() + "\n";
        return details;
    }
}
