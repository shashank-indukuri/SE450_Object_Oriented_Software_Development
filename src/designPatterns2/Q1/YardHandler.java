package Q1;

/**
 * The YardHandler class handles the conversion to yard
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public class YardHandler implements Handler {
    private Handler chain;

    @Override
    public void setSuccessor(Handler nextSuccessor) {
        this.chain = nextSuccessor;
    }

    @Override
    public String convert(Conversion con) {
        if (con.getUnit().equals("Yard")) {
            double num = con.getInputValue();
            double result = num * 1093.61;
            System.out.println("Conversion from km to yards: " + result);
            return Double.toString(result);
        } else {
            return (this.chain.convert(con));
        }
    }
}
