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
		String expected = "1";
		String actaul = fizzbuzz.checkBuzzFizz(input);
		assertEquals(expected,actaul);
	}
	@Test
	@DisplayName("TC2: buzzfizz number")
	void testBuzzFizzNumber() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String expected = "3";
		String actaul = fizzbuzz.checkBuzzFizz(input);
		assertEquals(expected,actaul);
	}

}
