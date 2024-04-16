package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.MaxNumber1;

class MaxNumber1Test {

	@Test
	void test() {
		//Test first number is max
        MaxNumber1 max = new MaxNumber1();
        int result = max.max3(10, 5, 3);
        assertEquals(10, result);
	}
	@Test
	void test2() {
		//Test second number is max
		MaxNumber1 max = new MaxNumber1();
        int result = max.max3(3, 8, 5);
        assertEquals(8, result);
	}
	@Test
	void test3() {
		//Test third number is max
        MaxNumber1 maxNumber = new MaxNumber1();
        int result = maxNumber.max3(2, 5, 11);
        assertEquals(11, result);

	}

}
