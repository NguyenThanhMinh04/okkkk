package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Advance4;

class Advance4Test {

	@Test
	void test() {
		Advance4 advance = new Advance4();

        // Test 1: Prime number
        int number = 17;
        boolean result = advance.isPrimeNumber(number);
        assertTrue(result);

        // Test 2: Composite number
        number = 36;
        result = advance.isPrimeNumber(number);
        assertFalse(result);

        // Test 3: Border case (2 is the smallest prime number)
        number = 2;
        result = advance.isPrimeNumber(number);
        assertTrue(result);

        // Test 4: Border case (1 is not a prime number)
        number = 1;
        result = advance.isPrimeNumber(number);
        assertFalse(result);

        // Test 5: Negative number (not a prime number)
        number = -7;
        result = advance.isPrimeNumber(number);
        assertFalse(result);
    }
	}

