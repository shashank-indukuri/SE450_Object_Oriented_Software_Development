package oopBasics1.exercise8;
/**
 * The Rectangle class implements an instance variables Length, width, and performs geometric operations with the parametrized Constructor
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class Rectangle {
    public int length;
    public int width;

    /**+
     * Constructor that initialises the length and width instance variables
     * @param length This is the value for the instance variable length
     * @param width This is the value for the instance variable length
     */
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * This method performs a perimeter of a Rectangle
     * @return int This returns a sum of length and width by multiplying with 2
     */
    public int perimeter() {
        return 2 * (length + width);
    }

    /**
     * This method performs an area of a Rectangle
     * @return int This returns a product of length and width
     */
    public int area() {
        return length * width;
    }

    /**
     * This method prints the details of a Rectangle using getDetails() method
     */
    public void printDetails() {
        System.out.println(this.getDetails());
    }

    /**
     * This method gets all the details of a Rectangle
     * @return String This returns a single string with details
     */
    public String getDetails() {
        String details = "Details of a Rectangle: \n";
        details += "Length of a Rectangle is " + this.length + "\n";
        details += "Width of a Rectangle is " + this.width + "\n";
        details += "Perimeter of a Rectangle is " + this.perimeter() + "\n";
        details += "Area of a Rectangle is " + this.area() + "\n";
        return details;
    }
}
