package edu.dmacc.dsmcode.coma510.review.assignment;

import java.util.Scanner;

public class Waitress implements Employee {
    private double total = 0;

    public Waitress() {
        this.total = 0.0;
    }

    public void takeOrder(Menu menu, Scanner userInput) {
        menu.showMenu();

        boolean done = false;
        while (!done) {
            System.out.print("What food would you like; enter 'done' when complete? ");
            String food = userInput.next();
            if (food.equals("done")) {
                done = true;
            } else if (menu.hasFood(food)) {
                total += menu.getPrice(food);
            } else {
                System.out.println("Sorry, we don't have " + food);
            }
        }
    }

    public void printTotal() {
        System.out.printf("Your total is $%.2f\n", total);
    }

    @Override
    public void printGreeting() {
        System.out.println("I'll be your waitress today! Can I take your order?");
    }
}
