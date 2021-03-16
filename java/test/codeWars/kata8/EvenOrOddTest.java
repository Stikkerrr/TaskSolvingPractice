package codeWars.kata8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
	
	@Test
	public void evenOrOdd() {
		assertEquals(EvenOrOdd.evenOrOdd(6), "Even");
		assertEquals(EvenOrOdd.evenOrOdd(7), "Odd");
	}
}