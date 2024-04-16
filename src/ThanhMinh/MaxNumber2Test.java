package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.MaxNumber2;

class MaxNumber2Test {

	@Test
	void test() {
		//Test first number is max
        MaxNumber2 max = new MaxNumber2();
        max.setNumber1(10);
        max.setNumber2(5);
        int result = max.max2();
        assertEquals(10, result);
	}
	@Test
	void test2()
	{
		//Test second number is max
        MaxNumber2 max = new MaxNumber2();
        max.setNumber1(1);
        max.setNumber2(9);
        int result = max.max2();
        assertEquals(9, result);
	}

}
