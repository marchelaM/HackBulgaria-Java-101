import java.util.Stack;

public class FunctionComposition {
	
	private Stack<Function> callStack = new Stack<>();
	
	
	public FunctionComposition(String composition){
		
		String[] funtions = composition.split(" . ");
		
		for (String f : funtions) {
			
			callStack.add(Context.allFunctions.get(f));
		}
		
		//System.out.println(this.functions);
	}

	public int evaluate(int x){
		//inc . inc . dec = h
		//h(1) = inc(inc(dec(1))
		
		while (!callStack.isEmpty()) {
			
			Function f = callStack.pop();
			System.out.println("Evaluating function: " + f.getName() + "(" + x + ")");
			x = f.evaluate(x);
		}
		
		return x;
	}
	
}
