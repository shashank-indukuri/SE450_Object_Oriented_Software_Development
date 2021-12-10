package Q2;

/**
 * The PepperDecorator class extends the PizzaDecorator and overrides the display method
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class PepperDecorator extends PizzaDecorator {

    public PepperDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void display() {
        super.display();
        System.out.print("With Pepper ");
    }
}
