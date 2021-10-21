package milestone3;

import java.util.Scanner;

public class Destination {

    public static void main(String[] args)
    {
        Scanner Destination = new Scanner( System.in );

        String Destination_name;


        System.out.print("Enter the Destination Name: ");
        Destination_name = Destination.next( );

        System.out.println("Destination: " + Destination_name);
    }
}
