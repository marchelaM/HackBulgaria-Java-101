package iteration;

public class SkipIterator implements Iterator{

	
	private Iterator iterator;
	
	private int skip;
	
	public SkipIterator(Iterator iterator, int skip) {
		assert iterator != null : "iterator can't be null";
		assert skip > 0 : "skip can't be < 1";
		this.skip = skip;
		this.iterator = iterator;
	}

	@Override
	public void first() {
		iterator.first();
		skipForwards();
		
	}

	private void skipForwards() {
		
		for (int i = 0; i < skip && !iterator.isDone(); iterator.next()) {
			
		}
	}

	@Override
	public void last() {
		iterator.last();
		
		skipBackwards();
		
		
	}

	private void skipBackwards() {
		for (int i = 0; i < skip && !iterator.isDone(); iterator.previous()) {
			
		}
		
	}

	@Override
	public boolean isDone() {
		
		return iterator.isDone();
	}

	@Override
	public void next() {
		iterator.next();
		skipForwards();
		
	}

	@Override
	public void previous() {
		
		iterator.previous();
		skipBackwards();
	}

	@Override
	public Object current() throws IndexOutOfBoundsException {
		
		return iterator.current();
	}

}
