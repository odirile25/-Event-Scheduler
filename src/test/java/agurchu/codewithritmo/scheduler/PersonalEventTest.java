package agurchu.codewithritmo.scheduler;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonalEventTest {
    @Test
    public void testGetEventName() {
        PersonalEvent event = new PersonalEvent();
        assertEquals("Personal Event", event.getEventName());
    }

    @Test
    public void testSetEventName() {
        PersonalEvent event = new PersonalEvent();
        event.setEventName("My Birthday");
        assertEquals("My Birthday", event.getEventName());
    }

//    @Test
//    public void testGetEventDate() {
//        PersonalEvent event = new PersonalEvent();
//        assertEquals("2025-01-01", event.getEventDate());
//    }
//
//    @Test
//    public void testSetEventDate() {
//        PersonalEvent event = new PersonalEvent();
//        event.setEventDate("2025-12-25");
//        assertEquals("2025-12-25", event.getEventDate());
//    }
//
//    @Test
//    public void testGetDuration() {
//        PersonalEvent event = new PersonalEvent();
//        assertEquals(60, event.getDuration());
//    }
//
//    @Test
//    public void testSetDuration() {
//        PersonalEvent event = new PersonalEvent();
//        event.setDuration(120);
//        assertEquals(120, event.getDuration());
//    }
//
//    @Test
//    public void testGetPriority() {
//        PersonalEvent event = new PersonalEvent();
//        assertEquals("Low", event.getPriority());
//    }
}