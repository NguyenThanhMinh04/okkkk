package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Triangle;

class TriangleTest {

	@Test
	void test() {
		// Test 1: Test first number is max
        Triangle.number1 = 10;
        Triangle.number2 = 5;
        Triangle.number3 = 3;
        int result = Triangle.maxLength();
        assertEquals(10, result);
	}
	@Test
	void test2()
	{
		Triangle.number1 = 3;
        Triangle.number2 = 8;
        Triangle.number3 = 5;
        int result = Triangle.maxLength();
        assertEquals(8, result);
	}
	@Test
	void test3()
	{
		Triangle.number1 = 4;
        Triangle.number2 = 6;
        Triangle.number3 = 9;
        int result = Triangle.maxLength();
        assertEquals(9, result);
	}

}
