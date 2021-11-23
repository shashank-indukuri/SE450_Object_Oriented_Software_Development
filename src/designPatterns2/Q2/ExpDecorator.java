package Q2;

/**
 * The ExpDecorator class formats the string to exponential notation
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public class ExpDecorator extends Decorator {

    public String convert(Conversion input) {
        double beforeFormat = Double.parseDouble(input.getOutput());
        String afterFormat = String.format("%.1e", beforeFormat);
        input.setOutput(afterFormat);
        return super.convert(input);
    }
}
