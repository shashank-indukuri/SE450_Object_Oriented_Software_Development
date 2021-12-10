package Q3;

/**
 * The ProductDirector class invokes the Builder methods based on the current reference
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class ProductDirector {
    protected Builder currentBuilder;

    // product building steps
    public void buildProduct(Builder builder) {

        currentBuilder = builder;
        currentBuilder.buildPart1();
        currentBuilder.buildPart2();
        currentBuilder.buildPart3();
        currentBuilder.buildPart4();
    }
}
