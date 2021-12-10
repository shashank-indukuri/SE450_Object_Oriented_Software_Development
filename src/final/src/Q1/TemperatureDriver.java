package Q1;

import java.time.*;
import java.util.Scanner;

/**
 * The TemperatureDriver class reads input from class and calculates the average of temperature from four sensors
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class TemperatureDriver {

    public static void main(String[] args) {
        System.out.println("Enter the date and time in the following format YYYY-MM-DD HH:MM - ");
        Scanner in = new Scanner(System.in);
        String[] dateTime = in.nextLine().split(" ");
        LocalDate date = LocalDate.parse(dateTime[0]);
        LocalTime time = LocalTime.parse(dateTime[1]);

        sensorInterface ts1 = new TS1();
        sensorInterface ts2 = new TS2();
        sensorInterface ts3 = new TS3();
        TS4 ts4Sensor = new TS4();
        SensorAdapter ts4 = new SensorAdapter(ts4Sensor);

        double ts1Temp = ts1.getTemp(date, time);
        double ts2Temp = ts2.getTemp(date, time);
        double ts3Temp = ts3.getTemp(date, time);
        double ts4Temp = ts4.getTemp(date, time);

        double avg = (ts1Temp + ts2Temp + ts3Temp + ts4Temp) / 4;

        System.out.println("Average temperature of four sensors at given time is: " + String.format("%.2f", avg) + " F");
    }
}
