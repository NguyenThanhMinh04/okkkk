package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Sort1;

class Sort1Test {

	@Test
	void test() {
		//Test number1 is greater than number 2
        Sort1 sort = new Sort1(8, 5);
        sort.sortAsc();
        assertEquals(5, sort.number1);
        assertEquals(8, sort.number2);
	}
	@Test
	void test2()
	{
		//Test number1 is less than number 2
        Sort1 sort = new Sort1(3, 6);
        sort.sortAsc();
        assertEquals(3, sort.number1);
        assertEquals(6, sort.number2);
	}

}
