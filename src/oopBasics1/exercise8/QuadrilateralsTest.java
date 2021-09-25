package oopBasics1.exercise8;
/**
 * The QuadrilateralsTest class implements an instances for the class Square and Rectangle with parametrized constructors
 * and prints the details using getDetails and invokes the printDetails instance method to print the details
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class QuadrilateralsTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(square.getDetails());
        System.out.println(rectangle.getDetails());
        square.printDetails();
        rectangle.printDetails();
    }
}
