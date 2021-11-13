package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {
	
	/**
	 * Parses through a list of passwords and returns the number of bad passwords.
	 * Passwords are considered bad if they are shorter than the minimum length
	 * or if they contain any characters other than letters a-z either upper or lower case.
	 * Calls the method isPasswordOnlyLetters to test if passwords contain non-letter characters.
	 *  
	 * @param minLength - the minimum length of the password
	 * @param passwordList - the ArrayList of passwords
	 * @return the number of bad passwords
	 */
	public static int badPasswords(int minLength, String[] passwordList) {
		int numBad = 0;
		for (int i = 0; i < passwordList.length; i++) {
			if (passwordList[i].length() < minLength || isPasswordOnlyLetters(passwordList[i]).equals("n")) {
				numBad++;
			} 
		}
		return numBad;
						}
	/**
	 * Tells whether or not a given String password contains characters other than
	 * letters a-z either upper or lower case.
	 *  
	 * @param password - the password to be tested
	 * @return "y" if the password contains only letters and "n" if not
	 */
	static String isPasswordOnlyLetters(String password) {		
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i); 
			if (! (ch >= 'a' && ch <='z'|| ch >='A' && ch <= 'Z')) {
				return "n"; 
			}
		}
		return "y";
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isPasswordOnlyLetters("bigmoose$"));
		System.out.println(isPasswordOnlyLetters("emusareawesome"));
		System.out.println(isPasswordOnlyLetters("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(badPasswords(8,passwords));
	}

}
