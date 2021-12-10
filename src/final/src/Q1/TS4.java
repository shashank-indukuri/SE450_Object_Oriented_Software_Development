package Q1;

/**
 * The TS4 class reads the input and returns the temperature in celsius
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class TS4 {
    double min = -130;
    double max = 130;

    public double getTS4Temp(int year, int month, int day, String time, String when) {
        double celsius = Math.floor(Math.random() * (max - min) + min);
        return celsius / 10;
    }
}
