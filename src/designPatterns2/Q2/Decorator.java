package Q2;

/**
 * The Decorator class is an abstract that sets the link to the another decorator
 *
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @version 1.0.0
 * @since 11/10/2021
 */

abstract public class Decorator implements Handler {
    protected Handler decorate;

    public void setSuccessor(Handler handle) {
        this.decorate = handle;
    }

    public String convert(Conversion con) {
        return this.decorate.convert(con);
    }

    ;
}