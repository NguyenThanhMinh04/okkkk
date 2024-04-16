package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import Nguyen.Advance7;

class Advance7Test {

	@Test
	void test() {
		Advance7 advance = new Advance7();

        // Test 1: Valid date (Sunday)
        int ngay = 5;
        int thang = 4;
        int nam = 2020;
        int result = advance.tinhThu(ngay, thang, nam);
        assertEquals(Calendar.SUNDAY, result);

        // Test 2: Valid date (Monday)
        ngay = 6;
        thang = 4;
        nam = 2020;
        result = advance.tinhThu(ngay, thang, nam);
        assertEquals(Calendar.MONDAY, result);

        // Test 3: Invalid date (out of range)
        ngay = 35;
        thang = 14;
        nam = 2005;
        result = advance.tinhThu(ngay, thang, nam);
        assertEquals(0, result);

        // Test 4: Future date (not possible)
        ngay = 1;
        thang = 1;
        nam = 2050;
        result = advance.tinhThu(ngay, thang, nam);
        assertEquals(0, result);
	}

}
