package iteration;

public class PowerCalculator {

	public static final PowerCalculator INSTANCE = new PowerCalculator();
	
	public PowerCalculator(){
		
	}
	
	public int calculate(int base, int exponent){
		
		assert exponent >= 0 : " exponent can't be null";
		
		int result = 0;
		
		for (int i = 0; i < exponent; ++i) {
			
			result *= base;
		}
		
		return result;
	}
	
	
}
