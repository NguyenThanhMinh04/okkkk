package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Calculator1;
import junit.framework.Assert;

class Calculator1Test {

	@Test
	void test() {
		// Test the result value
		Calculator1 cal = new Calculator1();
		assertEquals(5, cal.add(3, 2));
	}

	@Test
	void test2() {
		// Test the number larger than maximum the int type
		Calculator1 cal = new Calculator1();
		int result = cal.add(2000000000, 100000000);
		assertEquals(300000000, result);
	}

	@Test
	void test3() {
		// Test the number smaller than mimimum the int type
		Calculator1 cal = new Calculator1();
		int result = cal.add(-2000000000, -1000000000);
		assertEquals(300000000,result);

	}

}
