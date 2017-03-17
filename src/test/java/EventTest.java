import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(100, "noise", "noise", true, "noise", "noise");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsNumberOfAttendees_100() {
    Event testEvent = new Event(100, "noise", "noise", true, "noise", "noise");
    assertEquals(100, testEvent.getNumberOfAttendees());
  }

  @Test
  public void newEvent_getsLevelOfFoodService_snacks() {
    Event testEvent = new Event(100, "snacks", "noise", true, "noise", "noise");
    assertEquals("snacks", testEvent.getLevelOfFoodService());
  }

  @Test
  public void newEvent_getsLevelOfDrinkService_snacks() {
    Event testEvent = new Event(100, "snacks", "full bar", true, "noise", "noise");
    assertEquals("full bar", testEvent.getLevelOfDrinkService());
  }


}
