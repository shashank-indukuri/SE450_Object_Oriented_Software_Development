package Q3;

/**
 * The ConcreteBuilder2 class implements the Builder interface
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class ConcreteBuilder2 implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.add(21);
    }

    @Override
    public void buildPart2() {
        product.add(22);
    }

    @Override
    public void buildPart3() {
        product.add(23);
    }

    @Override
    public void buildPart4() {
        product.add(24);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
