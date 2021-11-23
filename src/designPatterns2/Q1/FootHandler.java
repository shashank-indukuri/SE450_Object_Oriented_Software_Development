package Q1;

/**
 * The FootHandler class handles the conversion to feet
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public class FootHandler implements Handler {
    private Handler chain;

    @Override
    public void setSuccessor(Handler nextSuccessor) {
        this.chain = nextSuccessor;
    }

    @Override
    public String convert(Conversion con) {
        if (con.getUnit().equals("Foot")) {
            double num = con.getInputValue();
            double result = num * 3280.84;
            System.out.println("Conversion from km to feet: " + result);
            return Double.toString(result);
        } else {
            return (this.chain.convert(con));
        }
    }
}
