import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

@Test
  public void isEvent_forMoreThanTwentyPeople_true(){
    Event customerEvent  = new Event();
    assertEquals(true, customerEvent.isEvent(25));
  }
}
