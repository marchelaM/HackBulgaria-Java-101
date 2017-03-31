package randomExample;

import java.util.Random;

public class RandomPasswordGenerator {

	private static final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static final String SMALL_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	
	private static final String DIGITS = "0123456789";
	
	private static final String SPECIAL_CHARS = "~!@#$%^&*()_+=`{}[]\\|':;.,/?<>";
	
	private static final String ALL_CHARS = CAPITAL_LETTERS + SMALL_LETTERS + DIGITS + SPECIAL_CHARS;
	
	
	private static Random rnd = new Random();
	
	
	public static void main(String[] args) {
		StringBuilder password = new StringBuilder();
		
		//Generate two random capital letters
		for (int i = 1; i <=2; i++) {
			
			char capitalLetter = generateChar(CAPITAL_LETTERS);
			insertAtRandomPosition(password, capitalLetter);
		}
		
		//Generate two random small letters
		for (int i = 1; i < 2; i++) {
			char smallLetters = generateChar(SMALL_LETTERS);
			insertAtRandomPosition(password, smallLetters);
		}
		
		//Generate one random digit
		char digit = generateChar(DIGITS);
		insertAtRandomPosition(password, digit);
		
		//Generate 3 special chars
		for (int i = 1; i <=3; i++) {
			char special = generateChar(SPECIAL_CHARS);
			insertAtRandomPosition(password, special);
			
		}
		
		//Generate few random characters(between 0 and 7)
		int count = rnd.nextInt(8);
		for (int i = 1; i <= count; i++) {
			char special  = generateChar(ALL_CHARS);
			insertAtRandomPosition(password, special);
		}

		System.out.println(password);
	}


	private static void insertAtRandomPosition(StringBuilder password, char character) {
		
		int randomPosition = rnd.nextInt(password.length() + 1);
		password.insert(randomPosition, character);
		
	}


	private static char generateChar(String avaliableChars) {
		
		int randomIndex = rnd.nextInt(avaliableChars.length());
		char randomChar = avaliableChars.charAt(randomIndex);
		
		return randomChar;
	}

}
