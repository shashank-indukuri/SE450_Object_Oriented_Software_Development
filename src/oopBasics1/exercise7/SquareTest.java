package oopBasics1.exercise7;
/**
 * The SquareTest class implements an instance for the class Square with parametrized constructor
 * and invokes the printDetails instance method to print the details
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class SquareTest {
    public static void main(String[] args) {
        System.out.println("----- SquareTest-----");
        Square square1 = new Square(5);
        Square square2 = new Square(7);
        square1.printDetails();
        square2.printDetails();
    }
}
