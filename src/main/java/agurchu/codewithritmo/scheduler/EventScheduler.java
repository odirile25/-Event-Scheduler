//package agurchu.codewithritmo.scheduler;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//import agurchu.codewithritmo.io.Io;
//import agurchu.codewithritmo.io.StandardIo;
//
//public class EventScheduler {
//    private final ArrayList<Event> listOfEvents = new ArrayList<>(Arrays.asList(
//            new PersonalEvent(),
//            new WorkEvent(),
//            new SocialEvent()));
//    private final String[] mainMenuOptions = {
//            "View Events",
//            "Add Event",
//            "Remove Event",
//            "Reschedule Event",
//            "Exit" };
//    private final Io io;
//
//    public EventScheduler() {
//        this(new StandardIo());
//    }
//
//    public EventScheduler(Io anIo) {
//        if (anIo == null) throw new RuntimeException();
//        io = anIo;
//    }
//
//    public void start() {
//        io.println("Welcome to Event Scheduler!");
//        boolean exit = false;
//        while (!exit) {
//            exit = mainMenuOptions();
//        }
//        io.println("Thank you. Goodbye!");
//    }
//
//    private boolean mainMenuOptions() {
//        displayEvents(false);
//        return displayMainMenuOptions();
//    }
//
//    private boolean displayMainMenuOptions() {
//        io.println("Main Menu:");
//        for (int i = 0; i < mainMenuOptions.length; i++) {
//            io.print("\t[");
//            io.print(Integer.toString(i + 1));
//            io.print("] ");
//            io.println(mainMenuOptions[i]);
//        }
//
//        int choice = io.anyInteger("Please choose an option from the above: ");
//        switch (choice) {
//            case 1 -> doViewEventsMenu();
//            case 2 -> doAddEventMenu();
//            case 3 -> doRemoveEventMenu();
//            case 4 -> doRescheduleEventMenu();
//            case 5 -> {
//                return true;
//            }
//            default -> {
//                return false;
//            }
//        }
//        return false;
//    }
//
//    private void doViewEventsMenu() {
//        io.println("View Events");
//        displayEvents(true);
//    }
//
//    private void doAddEventMenu() {
//        io.println("Add Event");
//        String eventName = io.anyString("What would you like to name this event? ");
//        String eventDate = io.anyString("Enter the event date (YYYY-MM-DD): ");
//        int duration = io.anyInteger("Enter the event duration (in minutes): ");
//        io.println("What type of event would you like to create?");
//        io.println("\t- Personal");
//        io.println("\t- Work");
//        io.println("\t- Social");
//        String eventType = io.anyString("Enter the event type: ").toLowerCase().trim();
//        addEvent(eventName, eventDate, duration, eventType);
//        Event newEvent = listOfEvents.get(listOfEvents.size() - 1);
//        io.println("New Event '" + newEvent.getEventName() + "' created. Date: " + newEvent.getEventDate() + ", Duration: " + newEvent.getDuration() + " mins, Priority: " + newEvent.getPriority());
//    }
//
//    private void doRemoveEventMenu() {
//        io.println("Remove Event");
//        displayEvents(false);
//        String eventToRemove = io.anyString("Which event would you like to remove? (Enter Event Name) ");
//        removeEvent(eventToRemove);
//    }
//
//    private void doRescheduleEventMenu() {
//        io.println("Reschedule Event");
//        displayEvents(true);
//        int index = io.anyInteger("Which event would you like to reschedule? ") - 1;
//        if (index >= 0 && index < listOfEvents.size()) {
//            String newDate = io.anyString("Enter the new event date (YYYY-MM-DD): ");
//            int newDuration = io.anyInteger("Enter the new duration (in minutes): ");
//            Event event = listOfEvents.get(index);
//            event.setEventDate(newDate);
//            event.setDuration(newDuration);
//            io.println("Event '" + event.getEventName() + "' rescheduled to " + newDate + " with duration " + newDuration + " mins.");
//        } else {
//            io.println("Invalid event selection.");
//        }
//    }
//
//    private void displayEvents(boolean showOptions) {
//        io.println("");
//        if (!showOptions) {
//            io.println("Your events:");
//        }
//        for (int i = 0; i < listOfEvents.size(); i++) {
//            Event event = listOfEvents.get(i);
//            if (showOptions) {
//                io.print("\t[");
//                io.print(Integer.toString(i + 1));
//                io.print("] ");
//            }
//            io.print(event.getEventName());
//            io.print(" - Date: ");
//            io.print(event.getEventDate());
//            io.print(", Duration: ");
//            io.print(Integer.toString(event.getDuration()));
//            io.print(" mins, Priority: ");
//            io.println(event.getPriority());
//        }
//        io.println("");
//    }
//
//    public ArrayList<Event> getListOfEvents() {
//        return listOfEvents;
//    }
//
//    public void addEvent(String eventName, String eventDate, int duration, String eventType) {
//        if (eventType.contains("personal")) {
//            listOfEvents.add(eventName.isBlank() ? new PersonalEvent() : new PersonalEvent(eventName, eventDate, duration));
//        } else if (eventType.contains("work")) {
//            listOfEvents.add(eventName.isBlank() ? new WorkEvent() : new WorkEvent(eventName, eventDate, duration));
//        } else if (eventType.contains("social")) {
//            listOfEvents.add(eventName.isBlank() ? new SocialEvent() : new SocialEvent(eventName, eventDate, duration));
//        } else {
//            listOfEvents.add(new PersonalEvent("New Event", eventDate, duration));
//        }
//    }
//
//    public void removeEvent(String eventName) {
//        int index = -1;
//        for (Event event : listOfEvents) {
//            if (event.getEventName().contains(eventName)) {
//                index = listOfEvents.indexOf(event);
//                io.println(event.getEventName() + " removed.");
//            }
//        }
//        if (index != -1) {
//            listOfEvents.remove(index);
//        }
//    }
//}
