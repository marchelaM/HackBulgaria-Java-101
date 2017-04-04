package iteration;

/**
 * Iterator which handles one value
 * 
 * @author marchela
 *
 */

public class SingletonIterator implements Iterator{
	
	private Object value;
	
	private boolean done;
	
	public SingletonIterator(Object value) {
		
		assert value != null : "value can't be null";
		
		this.value =  value;
	}
	

	@Override
	public void first() {
		done = false;
		
	}

	@Override
	public void last() {
		
		done = false;
		
	}

	@Override
	public boolean isDone() {
		
		return done;
	}

	@Override
	public void next() {
		done = true;
		
	}

	@Override
	public void previous() {
		
		done = true;
		
	}

	@Override
	public Object current() throws IndexOutOfBoundsException {
		if (!isDone()) {
			throw new IndexOutOfBoundsException();
		}
		return value;
	}

	
	
}
