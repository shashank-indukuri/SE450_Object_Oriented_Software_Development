package question4;
/**
 * The Nation class represents the country with an association of City instance.
 * @version 1.0.0
 * @since 10/20/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class Nation {
    private String name;
    private double population;
    private City capital;
    public Nation(String name, double population, City capital) {
        setName(name);
        setPopulation(population);
        setCapital(capital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
        System.out.println("The Capital for the " + name + " is " + this.capital.getName());
    }
}
