package Q2;

/**
 * The PizzaMaker class creates the order of decorators and displays the information
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new MushroomDecorator(new OliveDecorator(new PepperDecorator(new BasicPizza())));
        pizza.display();
    }
}
