package oopBasics1.exercise7;
/**
 * The RectangleTest class implements an instances for the class Rectangle with parametrized constructor
 * and invokes the printDetails instance method to print the details
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class RectangleTest {
    public static void main(String[] args) {
        System.out.println("----- RectangleTest-----");
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(7, 3);
        rectangle1.printDetails();
        rectangle2.printDetails();
    }
}
