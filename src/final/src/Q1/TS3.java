package Q1;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The TS3 class implements the sensorInterface
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/22/2021
 */

public class TS3 implements sensorInterface {

    @Override
    public double getTemp(LocalDate d, LocalTime t) {
        return Math.floor(Math.random() * (max - min) + min);
    }
}
