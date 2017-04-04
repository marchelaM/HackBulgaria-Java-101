package lists;

import junit.framework.TestCase;

public abstract class AbstractListTestCase extends TestCase {

	protected static final Object VALUE_A = "A";

	protected static final Object VALUE_B = "B";

	protected static final Object VALUE_C = "C";

	protected abstract List createList();
	
	/**
	 * Checking when we want to insert element in an empty list 
	 * that size of the list is incrementing with 1 and we receive
	 * it on the expected position
	 * 
	 */

	public void testInsertIntoEmptyList() {

		List list = createList();

		assertEquals(0, list.size());
		assertTrue(list.isEmpty());

		list.insert(0, VALUE_A);

		assertEquals(1, list.size());
		assertFalse(list.isEmpty());
		assertSame(VALUE_A, list.get(0));

	}

	public void testInsertBetweenElements() {

		List list = createList();

		list.insert(0, VALUE_A);
		list.insert(1, VALUE_B);
		list.insert(1, VALUE_C);

		assertEquals(3, list.size());

		assertSame(VALUE_A, list.get(0));
		assertSame(VALUE_B, list.get(1));
		assertSame(VALUE_C, list.get(2));

	}
	
	/**
	 * When we want to insert a new element before first element 
	 * to be sure that all elements will move on right with
	 * 1 position.
	 */

	public void testInsertBeforeFirstElement() {

		List list = createList();

		list.insert(0, VALUE_A);
		list.insert(0, VALUE_B);
		
		assertEquals(2, list.size());
		
		assertSame(VALUE_B, list.get(0));
		assertSame(VALUE_A, list.get(1));

	}
	
	public void testInsertAfterLastElement(){
		
		List list =createList();
		
		
		list.insert(0, VALUE_A);
		list.insert(1, VALUE_B);
		
		
		assertEquals(2, list.size());
		assertSame(VALUE_A, list.get(0));
		assertSame(VALUE_B, list.get(1));
		
	}
	
	
	public void testInsertOutOfBounds(){
		
		List list = createList();
		
		
		try {
			
			list.insert(-1, VALUE_A);
			fail();
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		
		try {
			
			list.insert(0, VALUE_B);
			fail();
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
	}
	
	
	public void testAdd(){
		
		List list = createList();
		
		list.add(VALUE_A);
		list.add(VALUE_B);
		list.add(VALUE_C);
		
		
		assertEquals(3, list.size());
		assertSame(VALUE_A, list.get(0));
		assertSame(VALUE_B, list.get(1));
		assertSame(VALUE_C, list.get(2));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
