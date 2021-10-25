package question4;
/**
 * The Question2Main class creates two city objects and instantiates the Nation with city instance
 * @version 1.0.0
 * @since 10/20/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

public class Question2Main {
    public static void main(String[] args) {
        System.out.println("---Testing for the Association between City and Nation---");

        City c1 = new City("New York City", "New York", 8419000);
        City c2 = new City("Chicago", "Illinois", 2710000);

        Nation n1 = new Nation("USA", 329000000, c1);

        n1.setCapital(c2);

        //If we try to set a different class object instead of City, it will throw a compiled time error
        // This proves the association relation between City and Nation
       // n1.setCapital(n1);
    }
}
