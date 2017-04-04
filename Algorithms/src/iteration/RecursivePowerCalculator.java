package iteration;

public final class RecursivePowerCalculator extends PowerCalculator{
	
	public static final PowerCalculator INSTANCE = new RecursivePowerCalculator();
	
	public RecursivePowerCalculator(){
		
	}
	
	public int calculate(int base, int exponent){
		
		assert exponent >= 0 : "exponent can't be null";
		
		
		return exponent > 0 ? base * calculate(base, exponent - 1) : 1;
	}
}
