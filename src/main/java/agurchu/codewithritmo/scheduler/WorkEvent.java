package agurchu.codewithritmo.scheduler;


public class WorkEvent extends Event {

    private String eventName;
    private String eventDate;
    private int duration;
    private String priority;


    public WorkEvent(){
        this.eventName = "Work Event";
        this.eventDate = "2025-01-01";
        this.duration = 120;
        this.priority = "High";
    }

    public WorkEvent(String eventName, String eventDate, int duration){
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