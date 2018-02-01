import java.util.Scanner;

public class SandwichShop
{
    public static void main (String[] args)
    {
        //Don't Change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        //Veggie Sandwiches
        System.out.print("Checking sales goals.");
        System.out.println();
        System.out.println("The sales goal for veggie sanwiches is 50");
        System.out.print("How many veggie sanwiches were sold today?");
        System.out.println();
        int countVeggie = keyboard.nextInt();

        if (countVeggie < goalForVeggies) {
            System.out.println(" Fell Short");
        }
        else {
            System.out.println(" Made Goal for Veggies!");
        }

        System.out.println();

        // Burgers
        System.out.print(" The sales goal for burgers is 250");
        System.out.println();
        System.out.println(" How many burgers were sold today?");
        System.out.println();
        int countBurger = keyboard.nextInt();
        System.out.println();


        if(countBurger < goalForBurgers) {
            System.out.println(" Fell Short");
        }
        else {
            System.out.println("Made Goal for Burgers!");
        }

        // Subs
        System.out.print("The sales goal for subs is 180");
        System.out.println();
        System.out.println("How many subs were sold today?");
        System.out.println();
        int countSubs = keyboard.nextInt();
        System.out.println();

        if(countSubs < goalForSubs) {
            System.out.println("Fell short");
        }
        else {
            System.out.println("Made Goal for Subs!");
        }

        // Soups
        System.out.print("The sales goals for soup is 70");
        System.out.println();
        System.out.print("How many soups were sold today?");
        System.out.println();
        int countSoups = keyboard.nextInt();
        System.out.println();

        if(countSoups < goalForSoup) {
            System.out.println("Fell short");
        }
        else {
            System.out.println("Made Goal for Soup!");
        }


        //Final Goals
        if (countVeggie>=50&&countBurger>=250&&countSubs>=180&&countSoups>=70) {
            System.out.println("Made goal for everything!");
        }
        else {
            System.out.println("");
        }

    }



}
