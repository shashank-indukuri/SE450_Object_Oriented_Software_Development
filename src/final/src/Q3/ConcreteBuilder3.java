package Q3;

/**
 * The ConcreteBuilder3 class implements the Builder interface
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */


public class ConcreteBuilder3 implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.add(31);
    }

    @Override
    public void buildPart2() {
        product.add(32);
    }

    @Override
    public void buildPart3() {
        product.add(33);
    }

    @Override
    public void buildPart4() {
        product.add(34);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
