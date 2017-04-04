package iteration;


public class ArrayIterator implements Iterator{
	
	private Object[] array1;
	
	private int first;
	
	private int last;
	
	private int current = -1;
	
	public ArrayIterator(Object[] array, int start, int length) {
		
		assert array != null : "array can't be null";
		
		assert first >= 0 : "start can't be < 0";
		
		assert first < array.length : "start can't be > array.length";
		
		assert length >= 0 : "length can't be < 0";
		
		array1 = array;
		
		first = start;
		
		last = first + length -1;
		
		assert last < array.length : "start + lenght can't be > array.lenght";
		
			
	}
	

	public ArrayIterator(Object[] array){
		
		assert array != null : "array can't be null";
		
		array1 = array;
		first = 0;
		last = array.length - 1;
	}
	
	
	
	public void first() {
		
		current = first;
		
	}


	public void last() {
		
		current = last;
		
	}


	public boolean isDone() {
		
		return current < first || current > last;
	}

	
	public void next() {
		++current;
		
	}

	
	public void previous() {
		--current;
	}

	public Object current() throws IndexOutOfBoundsException {
		
		if (isDone()) {
			
			throw new IndexOutOfBoundsException();
		}
		
		return array1[current] ;
	}

}
