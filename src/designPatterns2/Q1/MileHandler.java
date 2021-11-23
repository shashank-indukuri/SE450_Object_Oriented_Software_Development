package Q1;

/**
 * The MileHandler class handles the conversion to miles
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public class MileHandler implements Handler {
    private Handler chain;

    @Override
    public void setSuccessor(Handler nextSuccessor) {
        this.chain = nextSuccessor;
    }

    @Override
    public String convert(Conversion con) {
        if (con.getUnit().equals("Mile")) {
            double num = con.getInputValue();
            double result = num * 0.621371;
            System.out.println("Conversion from km to miles: " + result);
            return Double.toString(result);
        } else {
            return (this.chain.convert(con));
        }
    }
}
