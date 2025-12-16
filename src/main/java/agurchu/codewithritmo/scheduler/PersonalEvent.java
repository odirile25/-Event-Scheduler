package agurchu.codewithritmo.scheduler;

public class PersonalEvent extends Event {
    private String eventName ;
    private String eventDate;
    private int duration;
    private String priority;


    public PersonalEvent( ) {
        this.eventName = "Personal Event";
        this.eventDate = "2025-01-01";
        this.duration = 60;
        this.priority = "Low";
    }

    public PersonalEvent(String eventName, String eventDate, int duration){
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.duration = duration;

    }

    public PersonalEvent(String eventName){

        this.eventName = eventName;
    }


    @Override
   public String getEventName() {
        return  eventName;
    }

    @Override
    public void setEventName(PersonalEvent eventName) {

    }


    @Override

    public String getPriority(){
       return priority;
    }
//
    @Override
    public void setEventName(String newEventName) {
    eventName = newEventName;
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
    public void setEventDate(String newEventDate) {
        this.eventDate = newEventDate;

    }


    @Override
    public void setDuration(int newDuration) {
        this.duration = newDuration;

    }




}

