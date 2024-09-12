import org.w3c.dom.ls.LSOutput;

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
    public CoffeeDrink coffee1;
    public CoffeeDrink coffee2;
    public byte discount;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }



    // Constructor for CoffeeShop
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

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 1825;
        System.out.println("We are now founded in "+yearFounded+".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("iced coffee");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink coffee1 = new CoffeeDrink(1,"iced coffee",false);
        CoffeeDrink coffee2 = new CoffeeDrink(2,"hot chocolate",true);

        // TODO
        // Print out the order details
        coffee1.printInfo();
        coffee2.printInfo();


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        discount = (byte)(Math.random()*31);
        System.out.println("Your discount is "+discount+"%.");
    }


    // Method with a parameter for the special of the day
    public void specialOfTheDay(String specialParam) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's special is "+specialParam+".");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for(byte i = 1; i<6;i++){
            System.out.print(i);
            if (i<5){
                System.out.print(", ");
            }
        }
        System.out.println();


        // Print 2, 5, 8, 11
        for(byte i = 2; i<12;i+=3){
            System.out.print(i);
            if (i<11){
                System.out.print(", ");
            }
        }
        System.out.println();

        // Print 8 to 0
        for(byte i = 8; i>-1;i--){
            System.out.print(i);
            if (i>0){
                System.out.print(", ");
            }
        }

        System.out.println();

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
    }
}

