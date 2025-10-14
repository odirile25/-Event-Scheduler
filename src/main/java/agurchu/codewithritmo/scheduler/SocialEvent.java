package agurchu.codewithritmo.scheduler;


public class SocialEvent extends Event {

    private  String eventName;
    private String eventDate;
    private int duration;
    private String priority;

    public SocialEvent(){
        this.eventName = "Social Event";
        this.eventDate = "2025-01-01";
        this.duration = 90;
        this.priority = "Medium";
    }

    public SocialEvent(String eventName, String eventDate, int duration){
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.duration = duration;
    }



    @Override
    public String getEventName() {
        return eventName;
    }

    @Override
    public void setEventName(String updatedEventName) {
    this.eventName = updatedEventName;
    }

    @Override
    public String getEventDate() {
        return eventDate;
    }

    @Override
    public void setEventDate(String updatedEventDate) {
    this.eventDate = updatedEventDate;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int updatedDuration) {
    this.duration = updatedDuration;
    }

    @Override
    public void setEventName(PersonalEvent eventName) {

    }

    @Override
    public String getPriority() {
        return priority;
    }
}