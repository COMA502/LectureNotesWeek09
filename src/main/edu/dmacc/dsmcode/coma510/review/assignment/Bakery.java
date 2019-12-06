package edu.dmacc.dsmcode.coma510.review.assignment;

import java.io.FileNotFoundException;

public class Bakery extends Restaurant {
//    Create new classes Bakery and Deli. Both must extend the Restaurant class. Each class' constructor must accept
//    a restaurant name as a parameter and pass it to the parent's constructor. Each class must implement the
//    prepareTheKitchen method; the Bakery will print "Start the oven... Bake the bread..." and the Deli will print
//     *   "Get the bread... Cut the meat...".
    public Bakery(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public void prepareTheKitchen() {
        System.out.println("Start the oven... Bake the bread...");
    }
}
