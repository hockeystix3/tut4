package Tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc{

	@Test
	public void testadd(){
		assertEquals(3, Calc.add(1, 2));
	}

	@Test
	public void testsubtract() {
		assertEquals(1, Calc.subtract(2, 1));
	}

}