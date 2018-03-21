import java.util.Scanner;



public class AddingMachine {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int size;

        System.out.println("Welcome to Multiplication Tables");
        System.out.println("How large would you like to see them? ");

        size = keyboard.nextInt();
        while ( size < 1|| size < 20 ) {
            System.out.println("Please enter a number between 1-20");
            size = keyboard.nextInt();

            for(int left = 0; left <= size; left++) {
                for(int right = 0; right <= size; right++)
                    System.out.println(left + "*" + right+ "=" +(left*right));

            }

        }










    }




}
