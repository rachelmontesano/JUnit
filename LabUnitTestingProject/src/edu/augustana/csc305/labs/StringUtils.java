package edu.augustana.csc305.labs;

public class StringUtils {

	/**
	 * Performs the "Caesar" cipher to encode text, which involves shifting
	 * each letter of the alphabet some number of letters.  
	 * For example, if the key is 1, the message ABC becomes BCD.
	 * If the shift key is 2, ABC -> CDE (each letter is replaced by the letter two after it).
	 * If the shift key is 2, EMU -> GOW 
	 * Also, if the key is -2, GOW -> EMU (each letter is replaced by the letter two before it.)
	 * (Notice that a message can *always* be decoded by using the negative of the original key.)
	 * 
	 * If a letter goes past the beginning/end of the alphabet, it should wrap around.
	 * e.g., if the shift key is 1, ZOOM -> APPN
	 *  
	 * Spaces ' ' in the message should be copied as-is into the encoded message.  
	 * 
	 * @param message - the text to be encoded (precondition: we assume message contains only upper case letters and spaces).   
	 * @param keyShiftAmount - the number of letters to shift each character 
	 * 
	 * @return the encoded text 
	 */
	public static String caesarCipher(String message, int keyShiftAmount) {
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if (ch == ' ') {
				output.append(ch);
			} else // it's an upper case letter of the alphabet
			{
				char newCh = (char) (ch + keyShiftAmount);
				if (newCh > 'Z') {
					newCh = (char) (newCh - 26);
				} else if (newCh < 'A') {
					newCh = (char) (newCh + 26);
				}
				output.append(newCh);
			}
		}
		return output.toString();
	}
	
	public static void main(String[] args) {
		

	}

}
