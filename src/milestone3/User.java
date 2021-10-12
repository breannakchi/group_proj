package milestone3;

import java.util.ArrayList;

public class User {
    private String name, email;
    private ArrayList<Availability> availability;

    public User(String n, String e){
        name = n;
        email = e;
    }

    public void setAvailability(){

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Availability> getAvailability() {
        return availability;
    }
}
