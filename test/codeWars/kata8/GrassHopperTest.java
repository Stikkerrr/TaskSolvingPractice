package codeWars.kata8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopperTest {
	
	@Test
	public void when1Then1() {
		assertEquals(1,
				GrassHopper.summation(1));
	}
	@Test
	public void when8Then36() {
		assertEquals(36,
				GrassHopper.summation(8));
	}
}