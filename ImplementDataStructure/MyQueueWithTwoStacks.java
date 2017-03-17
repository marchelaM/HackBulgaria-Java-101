package ImplementDataStructure;

import java.util.Stack;

import week03_DataStructure.MyQueueInterface1;

public class MyQueueWithTwoStacks<T extends Comparable<T>> implements MyQueueInterface1<T> {
	
	private Stack<T> stack1;  // back of queue
	private Stack<T> stack2;  // front of queue
	
	public MyQueueWithTwoStacks(){
		
		stack1 = new Stack<T>();
        stack2 = new Stack<T>();
	}
	
	// move all items from stack1 to stack2
    private void moveStack1ToStack2() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }
    
    // is the queue empty?
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
 

	@Override
	public void enqueue(T element) {
		stack1.push(element);
		
	}

	@Override
	public T dequeue() {
		if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
               stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
	}

	@Override
	/**
	 * 
	 * @return return the item least recently added to the queue.
	 */
	public T peek() {
	        if (stack2.isEmpty()){
	        	
	        	 moveStack1ToStack2();
	         
	        }
	        return stack2.peek();
	}

	@Override
	public int getSize() {
		
		return stack1.size() + stack2.size();
	}

	

}
