// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCups, String flavor, boolean hasWhippedCream) {
        // DONE
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        this.numberOfCups = numberOfCups;
        this.flavor = flavor;
        this.hasWhippedCream = hasWhippedCream;
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // DONE
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.print("There are " + numberOfCups + " cups. The flavor is " + flavor + ". " + hasWhippedCream + ", the cofee has whipped cream.");
    }
}
