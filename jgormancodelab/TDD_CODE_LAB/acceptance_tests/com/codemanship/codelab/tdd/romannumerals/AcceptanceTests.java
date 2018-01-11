package com.codemanship.codelab.tdd.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AcceptanceTests {
	
	@Test
	public void romanNumeralForOneIsI() throws Exception {
		assertEquals("I", convert(1));
	}
	
	@Test
	public void romanNumeralForTwoIsII() throws Exception {
		assertEquals("II", convert(2));
	}
	
	@Test
	public void romanNumeralForThreeIsIII() throws Exception {
		assertEquals("III", convert(3));
	}
	
	@Test
	public void romanNumeralForFourIsIV() throws Exception {
		assertEquals("IV", convert(4));
	}
	
	@Test
	public void romanNumeralForFiveIsV() throws Exception {
		assertEquals("V", convert(5));
	}
	
	@Test
	public void romanNumeralForSixIsVI() throws Exception {
		assertEquals("VI", convert(6));
	}
	
	@Test
	public void romanNumeralForNineIsIX() throws Exception {
		assertEquals("IX", convert(9));
	}
	
	@Test
	public void romanNumeralForTenIsX() throws Exception {
		assertEquals("X", convert(10));
	}
	
	@Test
	public void romanNumeralForElevenIsXI() throws Exception {
		assertEquals("XI", convert(11));
	}
	
	@Test
	public void romanNumeralForFourteenIsXIV() throws Exception {
		assertEquals("XIV", convert(14));
	}
	
	@Test
	public void romanNumeralForFifteenIsXV() throws Exception {
		assertEquals("XV", convert(15));
	}
	
	@Test
	public void romanNumeralForNineteenIsXIX() throws Exception {
		assertEquals("XIX", convert(19));
	}

	@Test
	public void romanNumeralForTwentyIsXX() throws Exception {
		assertEquals("XX", convert(20));
	}
	
	@Test
	public void romanNumeralForFortyIsXL() throws Exception {
		assertEquals("XL", convert(40));
	}
	
	@Test
	public void romanNumeralForFortyNineIsXLIX() throws Exception {
		assertEquals("XLIX", convert(49));
	}
	
	@Test
	public void romanNumeralForFiftyIsL() throws Exception {
		assertEquals("L", convert(50));
	}
	
	@Test
	public void romanNumeralForFiftyOneIsLI() throws Exception {
		assertEquals("LI", convert(51));
	}
	
	@Test
	public void romanNumeralForNinetyIsXC() throws Exception {
		assertEquals("XC", convert(90));
	}
	
	@Test
	public void romanNumeralForNinetyNineIsXCIX() throws Exception {
		assertEquals("XCIX", convert(99));
	}
	
	@Test
	public void romanNumeralForOneHundredIsC() throws Exception {
		assertEquals("C", convert(100));
	}
	
	@Test
	public void romanNumeralForOneHundredAndOneIsCI() throws Exception {
		assertEquals("CI", convert(101));
	}
	
	@Test
	public void romanNumeralForFourHundredIsCD() throws Exception {
		assertEquals("CD", convert(400));
	}
	
	@Test
	public void romanNumeralForFourHundredNinetyNineIsCDXCIX() throws Exception {
		assertEquals("CDXCIX", convert(499));
	}
	
	@Test
	public void romanNumeralForFiveHundredIsD() throws Exception {
		assertEquals("D", convert(500));
	}
	
	@Test
	public void romanNumeralForFiveHundredAndOneIsDI() throws Exception {
		assertEquals("DI", convert(501));
	}
	
	@Test
	public void romanNumeralForNineHundredIsCM() throws Exception {
		assertEquals("CM", convert(900));
	}
	
	@Test
	public void romanNumeralForNineHundredNinetyNineIsCMXCIX() throws Exception {
		assertEquals("CMXCIX", convert(999));
	}
	
	@Test
	public void romanNumeralForOneThousandIsM() throws Exception {
		assertEquals("M", convert(1000));
	}
	
	@Test
	public void romanNumeralForOneThousandAndOneIsMI() throws Exception {
		assertEquals("MI", convert(1001));
	}
	
	@Test
	public void romanNumeralFor4999IsMMMMCMXCIX() throws Exception {
		assertEquals("MMMMCMXCIX", convert(4999));
	}
	
	private String convert(int number) {
		return new RomanNumeralConverter().convert(number);
	}

}
