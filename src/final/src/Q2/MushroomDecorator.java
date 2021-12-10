package Q2;

/**
 * The MushroomDecorator class extends the PizzaDecorator and overrides the display method
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void display() {
        super.display();
        System.out.print("With Mushroom ");
    }
}
