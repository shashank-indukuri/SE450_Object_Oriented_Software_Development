package Q3;

import java.util.LinkedList;

/**
 * The Product class is the concrete class that displays the object contents
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class Product {
    private LinkedList<Integer> components;

    public Product() {
        components = new LinkedList<>();
    }

    public void add(int component) {
        components.addLast(component);
    }

    public void display() {
        int count = 1;
        System.out.println("\n\nProduct Builder:");
        for (int i = 0; i < components.size(); i++) {
            System.out.println("Part" + count++ + ": " + components.get(i));
        }
    }
}
