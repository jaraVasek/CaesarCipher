package caesarsCipher;

public class Main {

	

		public static void main(String[] args) {

			String message = "How are you doing today!";
			int offset = 12;

			CaesarsCipher1 caesarsCipher = new CaesarsCipher1();

			String cipherMessage = caesarsCipher.cipher(message, offset);

			System.out.println("Original message: " + message);
			System.out.println("Offset: " + offset);
			System.out.println("Cipher message: " + cipherMessage);

		}

}
