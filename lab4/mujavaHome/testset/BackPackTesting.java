import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BackPackTesting {
	
	private int inputm = 10;
	private int inputn = 3;
	private int inputw[] = {3,4,5};
	private int inputp[] = {4,5,6};
	private int expected = 11;
	private BackPack bp = null;
	
	@Before
	public void setup() {
		bp = new BackPack();
	}
	
	@Test
	public void testBackPack() {
		assertEquals(expected,bp.BackPack_Solution(inputm,inputn,inputw,inputp)[3][10]);
//		assertTrue(expected.equals(bp.BackPack_Solution(inputm,inputn,inputw,inputp)));
	}

}
