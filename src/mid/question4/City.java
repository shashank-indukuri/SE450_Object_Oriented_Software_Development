package question4;
/**
 * The City class represents the city with attributes and methods.
 * @version 1.0.0
 * @since 10/20/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class City {
    private String name;
    private String state;
    private double population;

    public City(String name, String state, double population) {
        setName(name);
        setState(state);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }
}
