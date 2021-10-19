package milestone3;

public class Notification {
    private String message;
    private Event e;
    private User[] members;

    public Notification(String m, Event e){
        message = m;
        this.e = e;
    }

    public boolean sendEmail(){
        return false;
    }

    public boolean followUpWithUser(){
        return false;
    }

    /**
     * Method that ensures that everybody has submitted something for their availability.
     * @return
     */
    public boolean checkIfSchedsSubmitted(){
        boolean flag = true;
        for(User u: members){
//            if (u.getAvailability().isEmpty())
        }
        return flag;
    }

    public boolean googleCalendarNotif(){
        return false;
    }

}
