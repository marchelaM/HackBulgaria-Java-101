package week03_DataStructure;

public interface MyQueueInterface1<T extends Comparable<T>> {
	
	// Adds value to the end of the Queue.
	public void enqueue(T newElement);
	
	// Returns value from the front of the Queue and removes it.
	public T dequeue();
	
	// Returns value from the front of the Queue without removing it.
	public T peek();
	
	// Returns the number of elements in the Queue.
	public int getSize();
	

}
