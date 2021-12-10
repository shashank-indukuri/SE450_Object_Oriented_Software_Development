package Q1;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The sensorInterface provides the abstract method with min and max for random generator
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 10/20/2021
 */

public interface sensorInterface {
    double min = -130;
    double max = 130;

    double getTemp(LocalDate d, LocalTime t);
}
