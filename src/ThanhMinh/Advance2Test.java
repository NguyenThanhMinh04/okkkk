package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Advance2;

class Advance2Test {

	@Test
	void test() {
		Advance2 advance = new Advance2();
        long number = 5765;
        int result = advance.sum(number);
        assertEquals(23, result);
	}
	@Test
	void test2()
	{
		Advance2 advance = new Advance2();
		int number = 0;
        int result = advance.sum(number);
        assertEquals(0, result);
	}
	@Test
	void test3()
	{
		Advance2 advance = new Advance2();
		int number = -987;
        int result = advance.sum(number);
        assertEquals(24, result);
	}

}
