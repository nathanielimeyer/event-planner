import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(100, "noise", "noise", true, "noise", "noise");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getNumberOfAttendees_getsNumberOfAttendees_100() {
    Event testEvent = new Event(100, "noise", "noise", true, "noise", "noise");
    assertEquals(100, testEvent.getNumberOfAttendees());
  }

  @Test
  public void getLevelOfFoodService_getsLevelOfFoodService_snacks() {
    Event testEvent = new Event(100, "snacks", "noise", true, "noise", "noise");
    assertEquals("snacks", testEvent.getLevelOfFoodService());
  }

  @Test
  public void getLevelOfDrinkService_getsLevelOfDrinkService_fullbar() {
    Event testEvent = new Event(100, "snacks", "full bar", true, "noise", "noise");
    assertEquals("full bar", testEvent.getLevelOfDrinkService());
  }

  @Test
  public void getCake_getsCake_true() {
    Event testEvent = new Event(100, "snacks", "full bar", true, "noise", "noise");
    assertEquals(true, testEvent.getCake());
  }

  @Test
  public void getCouponCode_getsCouponCode_freeDJ() {
    Event testEvent = new Event(100, "snacks", "full bar", true, "band", "freeDJ");
    assertEquals("freeDJ", testEvent.getCouponCode());
  }

}
