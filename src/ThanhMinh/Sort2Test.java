package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Sort2;

class Sort2Test {

	@Test
	void test() {
		Sort2 sort = new Sort2();
        sort.number1 = 8;
        sort.number2 = 5;
        sort.sortDesc();
        assertEquals(8, sort.number2);
        assertEquals(5, sort.number1);
	}
	@Test
	void test2()
	{
		Sort2 sort = new Sort2();
        sort.number1 = 1;
        sort.number2 = 5;
        sort.sortDesc();
        assertEquals(1, sort.number2);
        assertEquals(5, sort.number1);
	}

}
