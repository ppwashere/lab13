package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class mainTest {

	
	@Test
	@DisplayName("TC1: normal number")
	void testNormalNumber() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int actaul = fizzbuzz.checkBuzzFizz(input);
		assertEquals(1, actaul);
	}
}
