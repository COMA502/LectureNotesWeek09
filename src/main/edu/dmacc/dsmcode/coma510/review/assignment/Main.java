package edu.dmacc.dsmcode.coma510.review.assignment;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    /**
     * This is a continuation of week 7 assignment, but now we're going to abstract out even more! This code already
     * runs, so be sure to make SMALL changes and test repeatedly!
     *
     * Here's an overview of what you'll need to do. Note, this is not in the same order as the requirements below.
     * * Create an Employee interface and implement it from Manager and Waitress
     * * Create an abstract Restaurant class and extend it using two new classes called Bakery and Deli
     * * Let the customer choose which restaurant (bakery or deli) and order similar to the previous assignments
     *
     * Requirement 1: Create the Interface and Abstract Class (8 points):
     * Create an Employee interface with the method header:
     * * public void printGreeting()
     * Create an abstract Restaurant class. The constructor should:
     * a. accept the restaurant name as a parameter and store it as an instance variable
     * b. initialize an instance variable for the restaurant's menu; give the menu the restaurant's name for the file
     * Include the following methods:
     * a. public void prepareTheKitchen(), which is abstract without an implementation
     * b. public void openRestaurant(), which calls prepareTheKitchen() and then prints "<restaurant name> is open for business!"
     * c. public Menu getMenu(), which simply returns the menu created in the constructor
     *
     * Requirement 2: Implement the Interface and Extend the Abstract Class (8 points):
     * * In Manger and Waitress, implement the Employee interface. You'll need to implement the printGreeting method by
     *   printing "I'm the manager, how can I help?" or "I'll be your waitress today! Can I take your order?" accordingly.
     * * Create new classes Bakery and Deli. Both must extend the Restaurant class. Each class' constructor must accept
     *   a restaurant name as a parameter and pass it to the parent's constructor. Each class must implement the
     *   prepareTheKitchen method; the Bakery will print "Start the oven... Bake the bread..." and the Deli will print
     *   "Get the bread... Cut the meat...".
     *
     * Requirement 3: Use the New Functionality in Main (4 points):
     * In main you must complete the following; notice that most of the logic already exists:
     * a. Create an instance of Deli and an instance of Bakery. On both of them call openRestaurant().
     * b. Ask the user, "Would you like the bakery or deli?".
     * c. Get the menu by using getMenu() on the restaurant that the user chose.
     * d. Using the existing logic below, allow the customer to 'add'/'order' from the menu for 'breakfast'/dinner.
     * e. If the user chose 'order' then call printGreeting() from the Waitress. Otherwise, call printGreeting() from
     *    the Manager for 'add'.
     * f. Use the existing logic below to print total or add to the menu.
     *
     * Here's an example of running for the first time. I named my restaurants "Greg's Deli" and "Greg's Bakery".
     * Get the bread... Cut the meat...
     * Greg's Deli is open for business!
     * Start the oven... Bake the bread...
     * Greg's Bakery is open for business!
     *
     * Would you like the bakery or deli? bakery
     *
     * Do you want to 'order' or 'add' to the menu? add
     * Would you like 'breakfast' or 'dinner'? breakfast
     * I'm the manager, how can I help?
     * --- Menu ---
     * What food would you like to add; enter 'done' when complete? donut
     * What's the price? 1
     * What food would you like to add; enter 'done' when complete? croissant
     * What's the price? 3
     * What food would you like to add; enter 'done' when complete? done
     * --- Menu ---
     * $1.00	donut
     * $3.00	croissant
     *
     * Here's an example of running the second time.
     * Get the bread... Cut the meat...
     * Greg's Deli is open for business!
     * Start the oven... Bake the bread...
     * Greg's Bakery is open for business!
     *
     * Would you like the bakery or deli? bakery
     *
     * Do you want to 'order' or 'add' to the menu? order
     * Would you like 'breakfast' or 'dinner'? breakfast
     * I'll be your waitress today! Can I take your order?
     * --- Menu ---
     * $1.00	donut
     * $3.00	croissant
     * What food would you like; enter 'done' when complete? donut
     * What food would you like; enter 'done' when complete? yogurt
     * Sorry, we don't have yogurt
     * What food would you like; enter 'done' when complete? croissant
     * What food would you like; enter 'done' when complete? done
     * Your total is $4.00
     */
    public static void main(String[] args) throws FileNotFoundException {
//        a. Create an instance of Deli and an instance of Bakery. On both of them call openRestaurant().
//        b. Ask the user, "Would you like the bakery or deli?".
//        c. Get the menu by using getMenu() on the restaurant that the user chose.
//        d. Using the existing logic below, allow the customer to 'add'/'order' from the menu for 'breakfast'/dinner.
//        e. If the user chose 'order' then call printGreeting() from the Waitress. Otherwise, call printGreeting() from
//           the Manager for 'add'.
//        f. Use the existing logic below to print total or add to the menu.

        Scanner userInput = new Scanner(System.in);

        System.out.println("Would you like the bakery or deli?");
        String restaurantChoice = userInput.next();

        System.out.print("\nDo you want to 'order' or 'add' to the menu? ");
        String operation = userInput.next();

        System.out.printf("Would you like 'breakfast' or 'dinner'? ");
        String meal = userInput.next();

        Bakery bakery = new Bakery("Greg's Bakery " + meal);
        bakery.openRestaurant();
        Deli deli = new Deli("Greg's Deli " + meal);
        deli.openRestaurant();

        Menu menu;
        if(restaurantChoice.equals("bakery")) {
            menu = bakery.getMenu();
        } else {
            menu = deli.getMenu();
        }

        if (operation.equals("order")) {
            Waitress waitress = new Waitress();
            waitress.takeOrder(menu, userInput);
            waitress.printTotal();
        } else if (operation.equals("add")) {
            Manager manager = new Manager();
            manager.addToMenu(menu, userInput);
        } else {
            System.out.println(operation + " is not a valid option. Please enter 'order' or 'add' instead.");
        }
    }
}
