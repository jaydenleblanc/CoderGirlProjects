import java.util.Scanner;

public class Grocery
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.print("Please list three items on your grocery list");
        System.out.println();
        System.out.print("Item 1?");
        String item1 = keyboard.nextLine();
        System.out.print("Item 2?");
        String item2 = keyboard.nextLine();
        System.out.print("Item 3?");
        String item3 = keyboard.nextLine();

        System.out.print("Now enter the quantity of each item");
        System.out.println();
        System.out.print("How many" + item1 + "?");
        int quantity1 = keyboard.nextInt();
        System.out.print("How many" + item2 + "?");
        int quantity2 = keyboard.nextInt();
        System.out.print("How many" + item3 + "?");
        int quantity3 = keyboard.nextInt();

        System.out.print("Now, please enter the price of each item.");
        System.out.println();
        System.out.print(" How much does one" + item1 + "cost ?");
        float cost1 = keyboard.nextFloat();
        System.out.print("How much does one" + item2 + "cost?");
        float cost2 = keyboard.nextFloat();
        System.out.print("How much does one" + item3 + "cost?");
        float cost3 = keyboard.nextFloat();

        System.out.print("Calculating your grocery bill");
        System.out.println();
        float result1 = (quantity1 * cost1);
        float result2 = (quantity2 * cost2);
        float result3 = (quantity3 * cost3);
        float resulttotal = result1 + result2 + result3;
        System.out.print(" Your total cost is" +  resulttotal);



















    }
}
