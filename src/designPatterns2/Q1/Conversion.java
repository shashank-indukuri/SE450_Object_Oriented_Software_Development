package Q1;

/**
 * The Conversion class that contains the instance variables unit and inputValue
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

    public Conversion(String unit, double inputValue) {
        this.unit = unit;
        this.inputValue = inputValue;
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
}
