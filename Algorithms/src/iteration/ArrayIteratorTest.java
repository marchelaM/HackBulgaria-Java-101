package iteration;

import junit.framework.TestCase;

public class ArrayIteratorTest extends TestCase{
	
	public void testIterationRespectsBounds(){
		
		Object[] array = new Object[]{"A", "B", "C", "D", "E", "F"};
		
		ArrayIterator iterator = new ArrayIterator(array, 1, 3);
		
		iterator.first();
		assertFalse(iterator.isDone());
		assertSame(array[1], iterator.current());
		
		iterator.next();
		assertFalse(iterator.isDone());
		assertSame(array[2], iterator.current());
		
		iterator.next();
		assertFalse(iterator.isDone());
		assertSame(array[3], iterator.current());
		
		iterator.next();
		assertTrue(iterator.isDone());
		try {
			
			iterator.current();
			fail();
			
		} catch (IndexOutOfBoundsException e) {
			
			System.out.println("XXXXXX");
		}
		
	}
	
	public void BackwardsIteration(){
		
		Object[] array2 = new Object[] {"A", "B", "C"};
		
		ArrayIterator iterator2 = new ArrayIterator(array2);
		
		iterator2.last();
		assertFalse(iterator2.isDone());
		assertSame(array2[2], iterator2.current());
		
		iterator2.previous();;
		assertFalse(iterator2.isDone());
		assertSame(array2[1], iterator2.current());
		
		iterator2.previous();;
		assertFalse(iterator2.isDone());
		assertSame(array2[0], iterator2.current());
		
		iterator2.previous();
		assertTrue(iterator2.isDone());
		try {
			iterator2.current();
			fail();
		} catch (Exception e) {
			System.out.println("YYYYYYYYY");
		}
		
		
		
		
		
		
		
		
		
	}

}
