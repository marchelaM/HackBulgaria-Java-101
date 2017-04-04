package iteration;

public class ReverseIterator implements Iterator {
	
	private Iterator iterator;
	
	public ReverseIterator(Iterator iterator) {

		assert iterator != null : "iterator can't be null";
		this.iterator = iterator;
		
	}

	@Override
	public void first() {
		iterator.last();
		
	}

	@Override
	public void last() {
		iterator.first();
		
	}

	@Override
	public boolean isDone() {
	
		return iterator.isDone();
	}

	@Override
	public void next() {
		iterator.previous();
		
	}

	@Override
	public void previous() {
		iterator.next();
		
	}

	@Override
	public Object current() throws IndexOutOfBoundsException {
		
		return iterator.current();
	}

}
