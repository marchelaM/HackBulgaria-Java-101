
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionCallsMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int fCount = Integer.parseInt(scanner.nextLine());
		ArrayList<Function> allFuncs = new ArrayList<>();
		
		for (int i = 0; i < fCount; i++) {
			
			String nextFunc = scanner.nextLine();
			Function f = new Function(nextFunc);
			
			allFuncs.add(f);
			
			Context.allFunctions.put(f.getName(), f);     //every time we create function we put in Context.
			
		}
		
		String compositionInput = scanner.nextLine();
		FunctionComposition functionComposition = new FunctionComposition(compositionInput);
		
		int x = scanner.nextInt(); 
		
		System.out.println(functionComposition.evaluate(x));
	}

}
