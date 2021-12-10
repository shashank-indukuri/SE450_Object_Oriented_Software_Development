package Q1;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * The SensorAdapter class converts the given date and time that is compatible with TS4 and returns the temperature
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class SensorAdapter implements sensorInterface {
    private final TS4 ts4;
    static DateTimeFormatter pstFormat = DateTimeFormatter.ofPattern("hh:mm a");

    public SensorAdapter(TS4 v2Sensor) {
        this.ts4 = v2Sensor;
    }

    @Override
    public double getTemp(LocalDate date, LocalTime time) {
        int day = date.getDayOfMonth();
        int month = date.getDayOfMonth();
        int year = date.getYear();

        String current = date + " " + time;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime formatDateTime = LocalDateTime.parse(current, formatter);

        //configuring the timezones to convert
        ZoneId pstZoneId = ZoneId.of("US/Pacific");
        ZoneId etZoneId = ZoneId.of("America/New_York");

        ZonedDateTime currentETime = formatDateTime.atZone(etZoneId);//Eastern Time
        ZonedDateTime currentPSTime = currentETime.withZoneSameInstant(pstZoneId);//Converting to PST

        //format the currentPSTime in 12-hour format
        String updatedTime = pstFormat.format(currentPSTime);
        String[] timing = updatedTime.split(" ");

        double celsius = ts4.getTS4Temp(year, month, day, timing[0], timing[1]);
        return ((celsius * 10) * 9) / 5 + 32;//Calculate the actual celsius and convert to Fahrenheit
    }
}
