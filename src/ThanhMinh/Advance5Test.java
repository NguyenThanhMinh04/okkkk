package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Advance5;

class Advance5Test {

	@Test
	void test() {
		Advance5 advance = new Advance5();

        // Test 1: 
        int number = 12121;
        boolean result = advance.kiemTraDoiXung(number);
        assertTrue(result);

        // Test 2: 
        number = 112;
        result = advance.kiemTraDoiXung(number);
        assertFalse(result);

        // Test 3: 
        number = 7;
        result = advance.kiemTraDoiXung(number);
        assertTrue(result);

        // Test 4: 
        number = -12321;
        result = advance.kiemTraDoiXung(number);
        assertFalse(result);
    }
	}

