package oopBasics1.exercise2;

import oopBasics1.exercise1.Square;
/**
 * The SquareTest class implements an instance for the class Square and displays perimeter and area
 * @version 1.0.0
 * @since 09/25/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class SquareTest {
    public static void main(String[] args) {
        System.out.println("----- SquareTest-----");
        Square square = new Square();
        square.side = 5;
        System.out.println("Perimeter of a Square is " + square.perimeter());
        System.out.println("Perimeter of a Square is " + square.area());
    }
}
