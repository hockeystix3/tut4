package Tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc{

@Test
public void testadd(){
	int i = 1;
	int j = 2;
	assertEquals(3, Calc.add(i, j));
}
}