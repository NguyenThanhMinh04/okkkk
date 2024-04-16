	package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Calculator2;

class Calculator2Test {

	@Test
	void test() {
		// Test the result value
		Calculator2 cal = new Calculator2();
		cal.number1=10;
		cal.number2=3;
		cal.sub();
		assertEquals(7, cal.result);
	}
	@Test
	void test2()
	{
		Calculator2 cal = new Calculator2();
		cal.number1=2100000000;
		cal.number2=100;
		cal.sub();
		assertEquals(210000100, cal.result);
	}
	@Test
	void test3()
	{
		Calculator2 cal = new Calculator2();
		cal.number1=-2100000000;
		cal.number2=-100;
		cal.sub();
		assertEquals(-210000100, cal.result);
	}


}
