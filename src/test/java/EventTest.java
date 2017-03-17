import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(100, "noise", "noise", true, "noise", "noise");
    assertEquals(true, testEvent instanceof Event);
  }
}
