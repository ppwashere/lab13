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
		String actaul = fizzbuzz.checkBuzzFizz(1);
		assertEquals("1", actaul);
	}
	@Test
	@DisplayName("TC2: mod 3 : Fizz")
	void testModThreeNumber() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actaul = fizzbuzz.checkBuzzFizz(3);
		assertEquals("Fizz", actaul);
	}
	@Test
	@DisplayName("TC3: mod 5 : Buzz")
	void testModFiveNumber() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actaul = fizzbuzz.checkBuzzFizz(5);
		assertEquals("Buzz", actaul);
	}
}
