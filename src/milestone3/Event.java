package milestone3;

import java.util.ArrayList;
import java.util.Scanner;

//Event Name
public class Event {
    private String name, destination;
    private ArrayList<User> groupMembers;


    public void addUser(User u){
        groupMembers.add(u);
    }

    public boolean checkUsers(){
        return false;
    }

    public static void main(String[] args)
    {
        Scanner Event = new Scanner( System.in );

        String Event_name;


        System.out.print("Enter your first name: ");
        Event_name = Event.next( );

        System.out.println("Your Event Name: " + Event_name);
    }

}
