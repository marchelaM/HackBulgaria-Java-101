package iteration;


import org.junit.Test;

import junit.framework.TestCase;

public class ReverseIteratorTest  extends TestCase{

	private static final Object[] ARRAY = new Object[]{"A", "B", "C"};
	
	public void testForwardsIterationBecomesBackwards(){
		
		ReverseIterator iterator = new ReverseIterator(new ArrayIterator(ARRAY));
		
		iterator.first();
		assertFalse(iterator.isDone());
		assertSame(ARRAY[2], iterator.current());
		
		iterator.next();
		assertFalse(iterator.isDone());
		assertSame(ARRAY[1], iterator.current());
		
		iterator.next();
		assertFalse(iterator.isDone());
		assertSame(ARRAY[0], iterator.current());
		
		iterator.next();
		assertTrue(iterator.isDone());
		try {
			iterator.current();
			fail();
		} catch (IndexOutOfBoundsException e) {
		
		}
	}
	
	public void testBackwardsIterationBecomesForwards(){
		
		
		ReverseIterator iterator1 = new ReverseIterator(new ArrayIterator(ARRAY));
		
		iterator1.last();
		assertFalse(iterator1.isDone());
		assertSame(ARRAY[0], iterator1.current());
		
		iterator1.previous();
		assertFalse(iterator1.isDone());
		assertSame(ARRAY[1], iterator1.current());
		
		iterator1.previous();
		assertFalse(iterator1.isDone());
		assertSame(ARRAY[2], iterator1.current());
		
		
		iterator1.previous();
		assertTrue(iterator1.isDone());
		try {
			iterator1.current();
			fail();
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
	}

}
