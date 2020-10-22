package caesarsCipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CipherTestCases {


	private CaesarsCipher1 caesarCipher = new CaesarsCipher1();

	@Test
	void testCipheredMessageWithOffsertOf12() {
		assertEquals("nai mdq kag pauzs fapmkG", caesarCipher.cipher("How are you doing today!", 12));

	}

	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 12));

	}    

}