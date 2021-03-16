package codeWars.kata8;

import org.junit.Test;

import static org.junit.Assert.*;

public class OppositeNumberTest {
	
	@Test
	public void opposite() {
		assertEquals(-1, OppositeNumber.opposite(1));
	}
}