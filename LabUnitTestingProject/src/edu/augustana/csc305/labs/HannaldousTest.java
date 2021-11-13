package edu.augustana.csc305.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HannaldousTest {

	@Test
	public void isPasswordOnlyLettersLowerCase() {
		assertEquals("y", Hannaldous.isPasswordOnlyLetters("abc"));
		assertEquals("y", Hannaldous.isPasswordOnlyLetters("xyz"));
	}
	
	@Test
	public void isPasswordOnlyLettersUpperCase() {
		assertEquals("y", Hannaldous.isPasswordOnlyLetters("ABC"));
		assertEquals("y", Hannaldous.isPasswordOnlyLetters("XYZ"));
	}
	
	@Test
	public void isPasswordOnlyLettersMixedCase() {
		assertEquals("y", Hannaldous.isPasswordOnlyLetters("AbCxYz"));
		assertEquals("y", Hannaldous.isPasswordOnlyLetters("tEsTiNg"));
	}
	
	@Test
	public void isPasswordOnlyLettersNumbers() {
		assertEquals("n", Hannaldous.isPasswordOnlyLetters("1"));
		assertEquals("n", Hannaldous.isPasswordOnlyLetters("word5"));
	}
	
	@Test
	public void isPasswordOnlyLettersSpecialCharacters() {
		assertEquals("n", Hannaldous.isPasswordOnlyLetters("*"));
		assertEquals("n", Hannaldous.isPasswordOnlyLetters("pass!"));
		assertEquals("n", Hannaldous.isPasswordOnlyLetters("wo#rd"));
		assertEquals("n", Hannaldous.isPasswordOnlyLetters("character$"));
	}
	
	@Test
	public void badPasswordsCorrect() {
		assertEquals(0, Hannaldous.badPasswords(10, new String[] {"GoodPassword"}));
		assertEquals(0, Hannaldous.badPasswords(5, new String[] {"password", "words", "MAXIMUM"}));
		assertEquals(0, Hannaldous.badPasswords(0, new String[] {"a"}));
	}
	
	@Test
	public void badPasswordsWrongLength() {
		assertEquals(1, Hannaldous.badPasswords(9, new String[] {"Password"}));
		assertEquals(2, Hannaldous.badPasswords(6, new String[] {"short", "words"}));
		assertEquals(3, Hannaldous.badPasswords(10, new String[] {"different", "lengths", "TEST"}));
	}
	
	@Test
	public void badPasswordsNotLetters() {
		assertEquals(4, Hannaldous.badPasswords(2, new String[] {"123", "ch@racter", "word#", "&wrong"}));
		assertEquals(4, Hannaldous.badPasswords(7, new String[] {"exAmple", "wrong", "num5", "password$", "correct", "2"}));
	}

}
