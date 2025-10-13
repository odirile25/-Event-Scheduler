//package agurchu.codewithritmo.scheduler;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.List;
//import java.util.Optional;
//
//public class EventSchedulerTest {
//    @Test
//    public void testAddingEvent() {
//        EventScheduler scheduler = new EventScheduler();
//        scheduler.addEvent("New Event", "2025-02-01", 60, "personal");
//        assertEquals(4, scheduler.getListOfEvents().size());
//    }
//
//    @Test
//    public void testRemoveEvent() {
//        EventScheduler scheduler = new EventScheduler();
//        final List<Event> events = scheduler.getListOfEvents();
//        final int eventCountAtStart = events.size();
//
//        final Optional<Event> eventToRemove = events.stream()
//                .filter(event -> event instanceof PersonalEvent)
//                .findFirst();
//        eventToRemove.ifPresentOrElse(
//                event -> scheduler.removeEvent(event.getEventName()),
//                Assertions::fail);
//
//        assertEquals(eventCountAtStart - 1, scheduler.getListOfEvents().size());
//    }
//}
