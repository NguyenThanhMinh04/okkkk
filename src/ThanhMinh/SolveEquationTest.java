package ThanhMinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Nguyen.SolveEquation;

class SolveEquationTest {

	@Test
	void test() {
		// Test Multi roots
		SolveEquation sol = new SolveEquation();
		String result = sol.linearEquation(0, 0);
		assertEquals("Multi roots", result);
	}

	@Test
	void test2() {
		// Test No root
		SolveEquation sol = new SolveEquation();
		String result = sol.linearEquation(0, 5);
		assertEquals("No root", result);
	}

	@Test
	void test3() {
		// Test One root
		SolveEquation sol = new SolveEquation();
		String result = sol.linearEquation(2, 3);
		assertEquals("One root", result);
	}

}
