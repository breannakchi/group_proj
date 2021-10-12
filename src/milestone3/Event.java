package milestone3;

import java.util.ArrayList;

public class Event {
    private String name, destination;
    private ArrayList<User> groupMembers;


    public void addUser(User u){
        groupMembers.add(u);
    }

    public boolean checkUsers(){
        return false;
    }

}
