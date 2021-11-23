package Q2;

import java.math.BigDecimal;

/**
 * The RoundDecorator class formats the string with two decimal places
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public class RoundDecorator extends Decorator {
    public String convert(Conversion input) {
        String format1 = String.format("%.2f", new BigDecimal(input.getOutput()));
        input.setOutput(format1);
        return super.convert(input);
    }
}
