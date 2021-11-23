package Q2;

/**
 * The AddUnitDecorator class formats the string with unit name
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public class AddUnitDecorator extends Decorator {

    public String convert(Conversion input) {
        String unit = input.getUnit();
        if (unit.equals("Mile")) {
            String finalFormat = input.getOutput() + " Miles";
            input.setOutput(finalFormat);
        } else if (unit.equals("Yard")) {
            String finalFormat = input.getOutput() + " Yards";
            input.setOutput(finalFormat);
        } else {
            String finalFormat = input.getOutput() + " Feet";
            input.setOutput(finalFormat);
        }
        return input.getOutput();
    }
}
