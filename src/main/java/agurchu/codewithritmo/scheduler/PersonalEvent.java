package agurchu.codewithritmo.scheduler;

public class PersonalEvent extends Event {
    public String eventName ;
    public String eventDate;
    public int duration;
    public String priority;


    public PersonalEvent( ) {
        this.eventName = "Personal Event";
    }

    @Override
   public String getEventName() {
        return eventName;
    }


    @Override

    public String getPriority(){
       return priority;
    }
//
    @Override
    public void setEventName(String eventName) {

    }

    @Override
    public int getDuration() {
        return duration;
    }
//
    @Override
    public String getEventDate() {
        return eventDate;
    }
//
    @Override
    public void setEventDate(String eventDate) {

    }


    @Override
    public void setDuration(int duration) {

    }




}

