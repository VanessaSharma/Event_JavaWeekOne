package test;

import static org.junit.Assert.*;
import main.Event;

import org.junit.Test;

public class EventTest {

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
