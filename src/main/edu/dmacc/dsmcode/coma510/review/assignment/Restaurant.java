package edu.dmacc.dsmcode.coma510.review.assignment;

import java.io.FileNotFoundException;

public abstract class Restaurant {

    String name;
    Menu menu;

    //accept the restaurant name as a parameter and store it as an instance variable
    //initialize an instance variable for the restaurant's menu; give the menu the restaurant's name for the file
    public Restaurant(String name) throws FileNotFoundException {
        this.name = name;
        this.menu = new Menu(this.name);
    }

    /**
     * a. public void prepareTheKitchen(), which is abstract without an implementation
     * b. public void openRestaurant(), which calls prepareTheKitchen() and then prints "<restaurant name> is open for business!"
     * c. public Menu getMenu(), which simply returns the menu created in the constructor
     */
    public abstract void prepareTheKitchen();

    public void openRestaurant() {
        prepareTheKitchen();
        System.out.println(name + " is open for business!");
    }

    public Menu getMenu() {
        return menu;
    }
}
