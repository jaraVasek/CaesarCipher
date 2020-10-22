package caesarsCipher;

public class CaesarsCipher1 {
	
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	private static final int ALPHABET_SIZE = 26;

	// original message to offset
	public String cipher(String message, int offset) {
		offset %= ALPHABET_SIZE; // offset doesn't exceed size 26
		char[] character = message.toCharArray(); // turn the message into char
		offsetBy(character, offset);
		return new String(character);

	}

	private void offsetBy(char[] character, int offset) {

		for (int i = 0; i < character.length; ++i) {
			// Eliminate space between words in cipher
			if (character[i] != ' ') {
				character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
			}
		}

	}

	private char offsetChar(char c, int offset, char letterA, char letterZ) {
		c += offset;

		if (c < letterA) {
			return (char) (c + ALPHABET_SIZE);
		}
		if (c > letterZ) {
			return (char) (c - ALPHABET_SIZE);
		}
		return c;
	}

}
