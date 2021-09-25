package oopBasics1.exercise3;
/**
 * The SquareTest class implements an instance for the class Square with parametrized constructor and displays perimeter and area
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class SquareTest {
    public static void main(String[] args) {
        System.out.println("----- SquareTest-----");
        Square square = new Square(5);
        System.out.println("Perimeter of a Square is " + square.perimeter());
        System.out.println("Perimeter of a Square is " + square.area());
    }
}
