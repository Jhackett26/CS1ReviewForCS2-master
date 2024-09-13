// CoffeeDrink object class

class CoffeeDrink {

    private int numberOfCups = 1;
    private String flavor = "water";
    private boolean hasWhippedCream = false;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCups,String flavor, boolean hasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.numberOfCups = numberOfCups;
        this.flavor = flavor;
        this.hasWhippedCream = hasWhippedCream;
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
    public void setFlavor(String newFlavParam){
        flavor = newFlavParam;
    }
    public String getFlavor(){
        return flavor;
    }
    public void setNumCups(int newNumCups){
        numberOfCups = newNumCups;
    }
    public int getNumCups(){
        return numberOfCups;
    }
    public void setHasWc(boolean newHasWC){
        hasWhippedCream = newHasWC;
    }
    public boolean getHasWC(){
        return hasWhippedCream;
    }
}
