import java.util.Scanner;
public class Temperatures {

    public static void main(String[] args) {


        System.out.println("What is the average temperature for each day?");
        int temperatures[][] = new int [4][7];
            temperatures[0]= new int[]{68, 70, 76, 70, 68, 71, 75};
            temperatures[1]= new int[]{76, 76, 87, 84, 82, 75, 83};
            temperatures[2]= new int[]{73, 72, 81, 78, 76, 73, 77};
            temperatures[3]= new int[]{64, 65, 69, 68, 70, 74, 72};

            int sumDay [] = new int[7];
            int sumTime []= new int[4];




        for(int index = 0; index < 4; index++) {
            for (int j = 0; j < 7; j++) {
                sumTime[index] = sumTime[index] + temperatures[index][j];
                sumDay[j] = sumDay[j] + temperatures[index][j];
            }
            }

        String days[] = new String[] {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
            for(int j = 0; j < 7; j++) {
                System.out.println(days[j] + ":" + sumDay[j]/4);

            }

         System.out.println("What is the average temperature for each time?");

         String times[] = new String[] {"7AM", "3PM", "7PM", "3AM"};
            for(int index = 0; index < 4; index++) {
                System.out.println(times[index] + ":" + sumTime[index]/7);
            }

         System.out.println("What is the final average temperature overall? ");

         int Sunday = sumDay[0];
         int Monday = sumDay[1];
         int Tuesday = sumDay[2];
         int Wednesday = sumDay[3];
         int Thursday = sumDay[4];
         int Friday = sumDay[5];
         int Saturday = sumDay[6];

         int avgOverall = ((Sunday + Monday + Tuesday + Wednesday + Thursday + Friday + Saturday)/28);
         System.out.println("Overall:  " + avgOverall);


