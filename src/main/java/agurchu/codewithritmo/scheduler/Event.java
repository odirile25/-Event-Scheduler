package agurchu.codewithritmo.scheduler;


public abstract class Event {
    public abstract String getEventName();
    public abstract void setEventName(String eventName);
    public abstract String getEventDate();
    public abstract void setEventDate(String eventDate);
    public abstract int getDuration();
    public abstract void setDuration(int duration);

    public abstract void setEventName(PersonalEvent eventName);

    public abstract String getPriority();
}
