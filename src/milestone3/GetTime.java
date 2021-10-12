package milestone3;

import java.util.Scanner;



public class GetTime
{

    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );

        int month, day, hour, min;


        System.out.print("Enter month (1-12): ");
        month = user_input.nextInt( );

        System.out.print("Enter day (1-31): ");
        day = user_input.nextInt( );

        System.out.print("Enter hour (0-23): ");
        hour = user_input.nextInt( );

        System.out.print("Enter min (0-59): ");
        min = user_input.nextInt( );

        System.out.println("The time you have provided is " + month + "/" + day + " " + hour + ":" + min);

    }


}
