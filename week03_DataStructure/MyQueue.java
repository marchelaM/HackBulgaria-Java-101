package week03_DataStructure;
/*package week03;

import java.util.NoSuchElementException;

public class MyQueue<T extends Comparable<T>> implements MyQueueInterface1<T> {
	
	private Node front;
	private Node rear;
	private int size;//number of items
	
	
	public class Node {
		private T element;
		private Node nextNode;

		public Node(T element) {
			this.element = element;
		}

		public Node(T element, Node nextNode) {
			this.element = element;
			this.nextNode = nextNode;
		}
	}
	
	public  MyQueue() {
		size = 0;
		front = null;
		rear = null;
	}
	
	public boolean isEmpty(){
		
		return (size == 0);
	}

	@Override
	public void enqueue(T element) {
		Node lastRear = rear;
		rear = new Node(element);
		rear.element = element;
		rear.nextNode = null;
		
		if(isEmpty()){
			
			front = rear;
		}else{
			
			lastRear.nextNode = rear;
		}
		size++;
		  System.out.println(element + " added to the queue"); 
		
	}
	

	public T dequeue() {
		
		T element = front.element;
		front = front.nextNode;
		
		if (isEmpty()) {
			
			rear = null;
			
		}
		size--;
		System.out.println(element + " remove the first added");
		
		return element ;
	}

	@Override
	public T peek() {
		if (front == null) {
            throw new NoSuchElementException();
        }
        return front.element;
	}

	@Override
	public int getSize() {
		
		return size;
	}
	
	@Override
	public String toString() {
		String str = "";
		Node temp = front;
		while (temp != null) {
			str += temp.element + " ";
			temp = temp.nextNode;
		}
		return str;
	}
	
	*/



//}
