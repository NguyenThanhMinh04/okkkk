package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.Advance6;

class Advance6Test {

	@Test
	void test() {
		Advance6 advance = new Advance6();

        // Test 1: Valid date, current year
        int ngay = 12;
        int thang = 1;
        int nam = 1999;
        int result = advance.tinhTuoi(ngay, thang, nam);
        assertEquals(25, result);

        // Test 2: Valid date, previous year
        ngay = 12;
        thang = 5;
        nam = 1999;
        result = advance.tinhTuoi(ngay, thang, nam);
        assertEquals(22, result);

        // Test 3: Invalid date (out of range)
        ngay = 35;
        thang = 14;
        nam = 2005;
        result = advance.tinhTuoi(ngay, thang, nam);
        assertEquals(-1, result);

        // Test 4: Future date (not possible)
        ngay = 1;
        thang = 1;
        nam = 2050;
        result = advance.tinhTuoi(ngay, thang, nam);
        assertEquals(-1, result);
    }
	}

