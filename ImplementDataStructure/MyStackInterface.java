package ImplementDataStructure;


/**
 * 
 * Stack interface
 * 
 * @param <T> should implement the Comparable interface.
 */

public interface MyStackInterface <T extends Comparable<T>>{
	
	/**
	 * 
	 *  Adds value to the end of the Stack.
	 * @param element
	 */
	public void push(T element);
	
	/**
	 * 
	 * Returns value from the end of the Stack and removes it.
	 * @return
	 */
	public T pop();
	
	/**
	 * 
	 * Returns value from the end of the Stack without removing it.
	 * @return
	 */
	
	public T peek();
	
	/**
	 * Returns the number of elements in the Stack.
	 * @return
	 */
	
	public int getSize();

}
