package week03_DataStructure;

public class MyLinkedList<T> implements MyLinkedListInterface1<T> {

	private Node<T> head = null;
	int size = 0;

	@Override
	public void addLast(T data) {
		Node<T> el = new Node<>();
		el.data = data;

		if (head == null) {
			head = el;
			size++;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = el;
			size++;
		}
	}

	@Override
	public void addFirst(T data) {
		Node<T> el = new Node<>();
		el.data = data;
		el.next = head;
		head = el;
		size++;
	}

	@Override
	public void add(T data, int index) {
		Node<T> el = new Node<>();
		el.data = data;

		int counter = 0;

		if (head == null) {
			head = el;
		} else {
			Node<T> temp = head;
			while (temp.next != null && index != counter + 1) {
				temp = temp.next;
				counter++;
			}
			el.next = temp.next.next;
			temp.next = el;

		}

	}

	@Override
	public T getFirst() {

		return head.data;
	}

	@Override
	public T getLast() {
		Node<T> temp = new Node();
		temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}
		return temp.data;
	}

	@Override
	public T get(int index) {
		Node<T> temp = new Node();
		temp = head;
		int counter = 0;
		while (temp.next != null && index != counter) {
			temp = temp.next;
			counter++;
		}

		return temp.data;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public void remove(int index) {
		int counter = 0;
		Node temp = head;

		if (index == 0) {
			head = head.next;
		} else {

			while (temp.next != null && index != counter + 1) {
				temp = temp.next;
				counter++;
			}
			temp.next = temp.next.next;
		}

	}

	@Override
	public MyLinkedListInterface1 addList(MyLinkedList ls, MyLinkedList ll) {
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}
		// temp.next = (Node<T>) ls.get(0);
		temp.next = ls.head;

		return ll;
	}

	@Override
	public String toString() {
		String str = "";
		Node<T> temp = head;
		while (temp != null) {
			str += temp.data + " ";
			temp = temp.next;
		}
		return str;
	}

	public MyLinkedList findElements(MyLinkedList ll, int index) {

		Node forTheEnd = head;

		MyLinkedList foundElements = new MyLinkedList();
		int counter = 0;
		while (forTheEnd != null && index != counter + 1) {
			forTheEnd = forTheEnd.next;
			counter++;
		}
		forTheEnd = forTheEnd.next;

		while (forTheEnd != null) {
			foundElements.addLast(forTheEnd.data);
			forTheEnd = forTheEnd.next;
		}

		return foundElements;
	}

}
