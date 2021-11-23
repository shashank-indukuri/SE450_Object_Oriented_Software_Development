package Q2;

/**
 * The Conversion class that contains the instance variables unit, inputValue and output
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public class Conversion {
    private String unit;
    private double inputValue;
    private String output;

    public Conversion(String unit, double inputValue) {
        this.unit = unit;
        this.inputValue = inputValue;
        this.output = "";
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getInputValue() {
        return inputValue;
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
