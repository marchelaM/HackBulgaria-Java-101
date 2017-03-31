package randomExample;

import java.util.Random;

public class Toto49 {

	public static void main(String[] args){
		
		Random random = new Random();
		
		for (int number = 1; number <= 6; number++) {
			
			int randomNumber = random.nextInt(49) + 1;
			System.out.printf("%d ", randomNumber);
		}
		
	}
	
}
