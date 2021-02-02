package codeWars.kata8;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToNumberTest {
	
	@Test
	public void stringToNumber1() {
		assertEquals("stringToNumber(1234)", 1234 , StringToNumber.stringToNumber("1234"));
	}
	@Test
	public void stringToNumber2() {
		assertEquals("stringToNumber(605)", 605 , StringToNumber.stringToNumber("605"));
	}
	@Test
	public void stringToNumber3() {
		assertEquals("stringToNumber(1405)", 1405 , StringToNumber.stringToNumber("1405"));
	}
	@Test
	public void stringToNumber4() {
		assertEquals("stringToNumber(-7)", -7 , StringToNumber.stringToNumber("-7"));
	}
	
}