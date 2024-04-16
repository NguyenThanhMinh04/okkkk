package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Calculator3;

class Calculator3Test {

	@Test
	void test() {
		//Test the result value
		Calculator3 cal = new Calculator3(6, 2);
		assertEquals(12, cal.mul());
	}
	@Test
	void test2()
	{
		//Test the number larger than maximum the int type
		Calculator3 cal = new Calculator3(Integer.MAX_VALUE, 2);
        int result = cal.mul();
        assertEquals(Integer.MAX_VALUE * 2, result);
	}
	@Test
	void test3()
	{
		//Test the number smaller than mimimum the int type
		Calculator3 cal = new Calculator3(Integer.MIN_VALUE, -2);
		int resurt = cal.mul();
		assertEquals(Integer.MIN_VALUE*-2, resurt);
	}

}
