import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTesting {
	private int input[] = {1,6,2,2,5};
	private int expected[] = {1,2,2,5,6};
	private BubbleSort bu = null;
	
	@Before
	public void setup() {
		bu = new BubbleSort();
	}
	
	@Test
	public void testBubbleSort() {
		assertArrayEquals(expected,bu.BubbleSort(input));
//		assertTrue(expected.equals(bp.BackPack_Solution(inputm,inputn,inputw,inputp)));
	}

}
