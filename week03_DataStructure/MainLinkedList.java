package week03_DataStructure;


public class MainLinkedList {

	public static void main(String[] args) {
		

		MyLinkedList ll = new MyLinkedList();
		
		for (int i = 0; i < 10; i++) {			
			ll.addLast(i);
		}
		/*int indexToTheEnd = 4;
		MyLinkedList foundElements = ll.findElements(ll, indexToTheEnd);
		System.out.println(ll);
		System.out.println(foundElements + " found elements from index " + indexToTheEnd );
		*/
		
		
		/*
		 * 
		MyLinkedList ls = new MyLinkedList();
		ls.addLast(69);
		ls.addLast(89);
		ls.addLast(99);
		ll.addFirst(7);
		ll.add(17,3);
		
		int first = (Integer)ll.getFirst();
		int last = (Integer)ll.getLast();
		int index = 3;
		int atIndex = (Integer)ll.get(index);
		int size = ll.size();
		
		System.out.println(ll);
		System.out.println(first + " first element");
		System.out.println(last + " last element");
		System.out.println(size + " size");
		System.out.println(atIndex + " is at index " + index);
		ll.remove(index);
		System.out.println(ll + " removed element at index " + index);
		
		MyLinkedList merged = ll.addList(ls,ll);
		
		System.out.println(merged + " After adding list.");
		*/
	}

}
