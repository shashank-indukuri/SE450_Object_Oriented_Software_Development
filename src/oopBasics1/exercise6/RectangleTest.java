package oopBasics1.exercise6;

import oopBasics1.exercise5.Rectangle;
/**
 * The RectangleTest class implements an instances for the class Rectangle with parametrized constructor
 * and displays perimeter and area
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
        System.out.println("Perimeter of a Rectangle 1 is " + rectangle1.perimeter());
        System.out.println("Perimeter of a Rectangle 1 is " + rectangle1.area());
        System.out.println("Perimeter of a Rectangle 2 is " + rectangle2.perimeter());
        System.out.println("Perimeter of a Rectangle 2 is " + rectangle2.area());
    }
}
