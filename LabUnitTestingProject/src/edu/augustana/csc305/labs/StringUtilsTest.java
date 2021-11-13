package edu.augustana.csc305.labs;


import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testCaesarCipherSimple() {
		assertEquals("BCD", StringUtils.caesarCipher("ABC", 1));
		assertEquals("CDE", StringUtils.caesarCipher("ABC", 2));
		assertEquals("GOW", StringUtils.caesarCipher("EMU", 2));
	}
	
	@Test
	public void testCaesarCipherSimpleBackward() {
		assertEquals("ABC", StringUtils.caesarCipher("BCD", -1));
		assertEquals("EMU", StringUtils.caesarCipher("GOW", -2));
	}

	@Test
	public void testCaesarCipherWithSpaces() {
		assertEquals("UIF IBQQZ NPPTF", StringUtils.caesarCipher("THE HAPPY MOOSE", 1));
	}
	
	@Test
	public void testCaesarCipherMore() {
		assertEquals("", StringUtils.caesarCipher("", 10)); // always test the corner cases! 
		// ADD your own assert tests here, to find any remaining bugs in this code
		assertEquals("ABC", StringUtils.caesarCipher("XYZ", 3));
		assertEquals("XYZA", StringUtils.caesarCipher("ZABC", -2));
		assertEquals("ABC", StringUtils.caesarCipher("ABC", 26));
		assertEquals("AZM", StringUtils.caesarCipher("AZM", -26));
		assertEquals("BCD", StringUtils.caesarCipher("ABC", 27));
		assertEquals(" SGHR HR Z  SDRS ", StringUtils.caesarCipher(" THIS IS A  TEST ", -1));
		assertEquals("ZAB", StringUtils.caesarCipher("MNO", 13));
		assertEquals("ABC", StringUtils.caesarCipher("ABC", 0));
	}


}
