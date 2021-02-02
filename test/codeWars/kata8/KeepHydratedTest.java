package codeWars.kata8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeepHydratedTest {
	
	KeepHydrated kh = new KeepHydrated();
	
	@Test
	public void liters1() {
		assertEquals(1, kh.Liters(2));
	}
	@Test
	public void liters2() {
		assertEquals(0, kh.Liters(0.97));
	}
	@Test
	public void liters3() {
		assertEquals(7, kh.Liters(14.64));
	}
	@Test
	public void liters4() {
		assertEquals(800, kh.Liters(1600.20));
	}
	@Test
	public void liters5() {
		assertEquals(40, kh.Liters(80));
	}
}