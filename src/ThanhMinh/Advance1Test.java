package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Advance1;

class Advance1Test {

	@Test
	void test() {
		Advance1 advance = new Advance1();
        int result = advance.USCLN(12, 18);
        assertEquals(6, result);
	}
	@Test
	void test2()
	{
		Advance1 advance = new Advance1();
		int result = advance.USCLN(-24, -36);
        assertEquals(12, result);
	}
	@Test
	void test3()
	{
		Advance1 advance = new Advance1();
		int result = advance.USCLN(0, 8);
        assertEquals(8, result);
	}

}
