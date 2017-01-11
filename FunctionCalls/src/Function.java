import java.util.LinkedList;

public class Function {

	private String fName;

	private String argumentName;

	private String fSource;

	private String fBody;

	public Function(String fSource) {
		this.fSource = fSource;
	// inc x = x + 1
		
		String[] funcParts = fSource.split(" = ");
		fBody = funcParts[1];
		
		String[] fDefinitionParts = funcParts[0].split(" ");
		fName = fDefinitionParts[0];
		argumentName = fDefinitionParts[1];
				
	}

	public String getName() {

		return fName;
	}

	public String getArgumentName() {

		return argumentName;
	}

	public int evaluate(int x) { // this is like public interface of the
									// function
		//"x + 1 - 2 + 3
		
		String[] bodyParts = fBody.split(" "); //now we make the new body split on parts using LinkedList
		LinkedList<String> operations = new LinkedList<>();
		LinkedList<Integer> values = new LinkedList<>();
		
		for (String part : bodyParts) {
			
			if (isOperation(part)) {
				
				operations.add(part);
				
			}
			
			if (isInteger(part)) {
				
				values.add(Integer.parseInt(part));
			}
			
			if (part.equals(argumentName)) {
				
				values.add(x);
			}
			
			if (isFunction(part)) {
				
				values.add(callOtherFunction(part, x));
			}
		}
		
		while(!operations.isEmpty()){
			
			String op = operations.removeFirst();
			int left = values.removeFirst();
			int right = values.removeFirst();
			int result = 0;
			
			
			switch (op) {
			case "+":
				result = left + right;
				break;
			case "-":
				result = left - right;
				break;
			}
			
			values.addFirst(result);
			
		}
		
		//System.out.println(operations);
		//System.out.println(values);
		

		return values.removeFirst();
	}
	
	private int callOtherFunction(String part, int x) {
		
		String[] fParts = part.split("\\(");
		String fName = fParts[0];
		String argument = fParts[1].substring(0, fParts[1].length() - 1);
		int argumentValue = 0;
		
		if (argument.equals(argumentName)) {
			
			argumentValue = x;
			
		}else if (isInteger(argument)) {
			
			argumentValue = Integer.parseInt(argument);
			
		}
		
		
		return Context.allFunctions.get(fName).evaluate(argumentValue);
	}

	private boolean isFunction(String part) {
		
		int indexOfOpenBracket = part.indexOf("(");
		int indexOfCloseBracket = part.indexOf(")");
		
		if (indexOfOpenBracket == -1 || indexOfCloseBracket == -1) {
			
			return false;
		}
		
		
		return indexOfOpenBracket < indexOfCloseBracket;        //that means that we want to have open bracket before close
		                                                        //bracket.
	}

	public String toString(){
		
		return fSource;
	}
	
	private boolean isInteger(String part){
		
		for (char ch : part.toCharArray()) {
			
			if (!Character.isDigit(ch)) {
				
				return false;
			}
			
		}
		return true;
	}
	
	private boolean isOperation(String part){
		
		return (part.equals("+") || part.equals("-"));
	}
}

