package Q2;

/**
 * The Converter class is the driver class that creates the chain among the handlers
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public class Converter {
    public static void main(String[] args) {
        ConverterGUI ui = new ConverterGUI();
    }

    public static String convert(Conversion con) {
        Handler h1 = new MileHandler();
        Handler h2 = new YardHandler();
        Handler h3 = new FootHandler();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        String result = h1.convert(con);
        con.setOutput(result);
        Decorator d1 = new RoundDecorator();
        Decorator d2 = new ExpDecorator();
        Decorator d3 = new AddUnitDecorator();
        d1.setSuccessor(d2);
        d2.setSuccessor(d3);
        return (d1.convert(con));
    }
}
