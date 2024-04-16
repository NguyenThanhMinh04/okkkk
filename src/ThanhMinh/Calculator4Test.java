package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Calculator4;
import junit.framework.Assert;

class Calculator4Test {

	@Test
	void test() {
		//Test the result value
		Calculator4 cal = new Calculator4();
		cal.setNumber1(20);
		cal.setNumber2(10);
		assertEquals(2, cal.div());
	}
	@Test
	void test2()
	{
		//Division 0
		Calculator4 cal = new Calculator4();
		cal.setNumber1(5);
        cal.setNumber2(0);
        try {
            cal.div();
            Assert.fail("Expected ArithmeticException was not thrown");
        } catch (ArithmeticException e) {
            Assert.assertEquals("/ by zero", e.getMessage());
        }
	}
	@Test
	void test3()
	{
		// Return float type
		Calculator4 cal = new Calculator4();
		cal.setNumber1(5);
		cal.setNumber2(2);
		float resurt = cal.div();
		assertEquals(2.5, resurt);
	}

}
