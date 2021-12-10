package Q3;

/**
 * The ProductDriver class tests all scenarios to create and display objects by using three concrete builders
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class ProductDriver {

    public static void main(String[] args) {

        ProductDirector productDirector = new ProductDirector();

        Builder concreteBuilder1 = new ConcreteBuilder1();
        Builder concreteBuilder2 = new ConcreteBuilder2();
        Builder concreteBuilder3 = new ConcreteBuilder3();

        // Build a Concrete Builder 1 Product
        productDirector.buildProduct(concreteBuilder1);
        Product unit1 = concreteBuilder1.getProduct();
        unit1.display();

        // Build a Concrete Builder 2 Product
        productDirector.buildProduct(concreteBuilder2);
        Product unit2 = concreteBuilder2.getProduct();
        unit2.display();

        // Build a Concrete Builder 3 Product
        productDirector.buildProduct(concreteBuilder3);
        Product unit3 = concreteBuilder3.getProduct();
        unit3.display();
    }
}
