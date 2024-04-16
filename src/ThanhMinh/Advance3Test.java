package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Advance3;

class Advance3Test {

	@Test
	void test() {
		Advance3 advance = new Advance3();

        // Test 1: n = 0
        int result = advance.fibonacci(0);
        assertEquals(0, result);

        // Test 2: n = 1
        result = advance.fibonacci(1);
        assertEquals(1, result);

        // Test 3: n = 5
        result = advance.fibonacci(5);
        assertEquals(5, result);

        // Test 4: n = 10
        result = advance.fibonacci(10);
        assertEquals(55, result);

        // Test 5: n = -3 (invalid input)
        result = advance.fibonacci(-3);
        assertEquals(-1, result);
	}

}
