import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    // constructor has the same name as the file and it has no return type
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // DONE
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 1990;
        System.out.println("We were founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // DONE
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Pumpkin Spice Latte");
        countCups();
        baristasChoice();

        // DONE
        // Create two CoffeeDrink objects
        CoffeeDrink coffee1 = new CoffeeDrink(2, "Pumpkin", true);
        CoffeeDrink coffee2 = new CoffeeDrink(1, "Mocha", false);

        // TODO
        // Print out the order details
        System.out.println(coffee1);
        System.out.println(coffee2);


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // DONE
        // Make this method generate a random integer discount (0-30%)
        int discount = (int)(Math.random()*30);
        // and print the result.
        System.out.println("The discount is " + discount + "%!");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // DONE
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's special is " + special + "!");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // DONE
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for(int i = 1; i <=5; i++) {
            System.out.println(i);
        }


        // Print 2, 5, 8, 11
        for(int i = 2; i <= 11; i += 3) {
            System.out.println(i);
        }

        // Print 8 to 0
        for(int i = 8; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // DONE
        // Make this method generate a random decimal between 0 and 1
        double drink = Math.random();
        // and print one of four drink recommendations based on its value.
        if(drink < 0.25) {
            System.out.println("I recommend a latte.");
        } else if(0.25 <= drink && drink < 0.5) {
            System.out.println("I recommend a frappuccino.");
        } else if(0.5 <= drink && drink < 0.75) {
            System.out.println("I recommend a expresso.");
        } else {
            System.out.println("I recommend a cappuccino.");
        }
    }
}

