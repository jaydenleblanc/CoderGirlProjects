import java.util.Scanner;

public class Entertainment
{
    public static void main (String[] args)
    {
        //Question
        Scanner keyboard = new Scanner (System.in);
        String name;
        System.out.print("What is the weather like today?");
        System.out.println();
        System.out.print("Answer:");
        String weather = keyboard.nextLine();

        if(weather.equals("sunny") || weather.equals("rainy") || weather.equals("cloudy")){
            System.out.print("What kind of mood are you in for activities?");
        }

        else {
            System.out.print("Error: Your weather answer wasn't one of the valid options");
        }


        System.out.println();
        System.out.print("Answer:");
        String mood = keyboard.nextLine();

        if(mood.equals("exercise")&& weather.equals("sunny")) {
            System.out.print("For " + mood + " on a " + weather + " day, try a brisk walk in a nature preserve."); }
        else if(mood.equals("party")&& weather.equals("sunny")) {
            System.out.print("For " + mood + " on a " + weather + " day, look for a street festival.");}
        else if(mood.equals("quiet")&& weather.equals("sunny")){
            System.out.print("A "+ weather + " day is a beautiful time to sit under a tree and read a book."); }
        else if(mood.equals("exercise") && weather.equals("cloudy")) {
            System.out.print("For" + mood + " on a" + weather + " day, ride the paddle boats at the park"); }
        else if(mood.equals("party") && weather.equals("cloudy")) {
            System.out.print("For a fun" + mood + "on a" + weather + " day, ride the paddle boats at the park"); }
        else if(mood.equals("quiet") && weather.equals("cloudy")) {
            System.out.print("On a " + weather + " day, take a camera or paints to sketch the flowers at the lakeside");
        }
        else if(mood.equals("exercise") && weather.equals("rainy")){
            System.out.print("Giant indoor trampolines are a fun place to " + mood + "on a " + weather + " day");
        }
        else if(mood.equals("party") && weather.equals("rainy")) {
            System.out.print("See if your friends are playing board games to pass a " + weather + " day"); }

        else if(mood.equals("quiet") && weather.equals("rainy")) {
            System.out.print("A" + weather + " day is a peaceful time to journal and daydream");
        }
        else if(mood.equals("") && weather.equals("?")) {
            System.out.print("Error: Your weather answer wasn't one of the valid options");
        }
        else if(mood.equals("?") && weather.equals("")) {
            System.out.print("Error: Your mood answer wasn't one of the valid options.");
    }

        }
    }



