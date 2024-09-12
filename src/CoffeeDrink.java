// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numCupsParam,String flavorParam, boolean hasWCParam) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        numberOfCups = numCupsParam;
        flavor = flavorParam;
        hasWhippedCream = hasWCParam;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.print("Your order is "+numberOfCups);
        if(numberOfCups==1){
            System.out.print(" cup ");
        }
        else{
            System.out.print(" cups ");
        }
        System.out.print("of "+flavor);
        if(hasWhippedCream){
            System.out.println(" with whipped cream.");
        }
        else{
            System.out.println(" without whipped cream.");
        }
    }
}
