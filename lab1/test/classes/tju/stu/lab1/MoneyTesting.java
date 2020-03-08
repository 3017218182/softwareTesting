package classes.tju.stu.lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTesting {

	Money mon = null;
	
	@Before
	public void setup() {
		mon = new Money();
	}
	
	@Test
	public void testMoney() {
		assertEquals(false,mon.calculate(-1));
	}
	
}
