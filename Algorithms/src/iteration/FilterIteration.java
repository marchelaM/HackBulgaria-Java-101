package iteration;

public class FilterIteration implements Iterator{

	
	private Iterator iterator;
	
	private Predicate predicate;
	
	public FilterIteration(Iterator iterator, Predicate predicate) {
		
		assert iterator != null : "iterator can't be null";
		assert predicate != null : "predicate can't be null";
		
		this.iterator = iterator;
		this.predicate = predicate;
		
	}
	
	
	@Override
	public void first() {
		iterator.first();
		filterForwards();
		
	}

	private void filterForwards() {
		while (!iterator.isDone() && !predicate.evaluate(iterator.current())) {
			iterator.next();
		}
		
	}


	@Override
	public void last() {
	
		iterator.last();
		filterBackwards();
	}

	private void filterBackwards() {
		
		while (!iterator.isDone() && !predicate.evaluate(iterator.current())) {
		
			iterator.previous();
		}
		
	}


	@Override
	public boolean isDone() {
		return iterator.isDone();
	}

	@Override
	public void next() {
		
		iterator.next();
		filterForwards();
		
	}

	@Override
	public void previous() {
		iterator.previous();
		filterBackwards();
		
	}

	@Override
	public Object current() throws IndexOutOfBoundsException {
		
		return iterator.current();
	}

}
