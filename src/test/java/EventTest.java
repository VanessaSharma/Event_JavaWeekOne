import static org.junit.Assert.*;
import org.junit.Test;

public class EventTest {

	@Test
	public void getGuests_increasesCostPerPerson_10(){
		Event userEvent = new Event(10, 20, 35, 350);
			assertTrue(userEvent instanceof Event);
	}
	@Test
	public void getFood_increasesCostPerPerson_20(){
		Event userEvent = new Event(10, 20, 35, 350);
			assertTrue(userEvent instanceof Event);
	}
	@Test
	public void getDrinks_increasesCostPerPerson_35(){
		Event userEvent = new Event(10, 20, 35, 350);
			assertTrue(userEvent instanceof Event);
	}
	@Test
	public void getEntertainment_increasesCostOnChoice_350(){
		Event userEvent = new Event(10, 20, 35, 350);
			assertTrue(userEvent instanceof Event);
	}

	@Test
	public void test() {
		int guests = 10;
		int food = 20;
		int drinks = 35;
		int entertainment = 350;
  Event event = new Event( guests, food, drinks, entertainment);
	assertEquals(900, event.getTotalEventCost());
	System.out.println(event.getTotalEventCost());
  }

}
