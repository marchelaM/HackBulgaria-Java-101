package ImplementDataStructure;

import java.util.Queue;

public class Tester2 {

	public static void main(String[] args) {
		MyQueueInterface<Integer> q= new MyLinkedList<Integer>();
		
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		System.out.println(q.getSize());
		System.out.println(q.dequeue());
		System.out.println(q.getSize());
		System.out.println(q.peek());

	}

}
