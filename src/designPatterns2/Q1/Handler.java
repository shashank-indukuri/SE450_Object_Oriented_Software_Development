package Q1;

/**
 * The Handler interface
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

public interface Handler {

    void setSuccessor(Handler nextSuccessor);

    String convert(Conversion con);

}
