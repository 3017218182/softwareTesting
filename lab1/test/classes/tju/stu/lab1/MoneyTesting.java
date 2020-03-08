package classes.tju.stu.lab1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MoneyTesting {
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{93,true},
			{94,false},
			{0,true},
			{-1,false}
		});
	}
	
	private int input;
	private boolean expected;
	private Money mon = null;
	
	public MoneyTesting(int input,boolean expected) {
		this.input=input;
		this.expected=expected;
	}
	
	@Before
	public void setup() {
		mon = new Money();
	}
	
	@Test
	public void testMoney() {
		assertEquals(this.expected,mon.calculate(this.input));
	}

}

