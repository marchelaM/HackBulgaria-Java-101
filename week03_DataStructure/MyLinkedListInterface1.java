package week03_DataStructure;

public interface MyLinkedListInterface1 <T> {
	
	public void addFirst(T newElement);
	public void addLast(T newElement);
	public void add(T newElement, int index);
	public T getFirst();
	public T getLast();
	public T get(int index);
	public int size();
	public void remove(int index);
	public MyLinkedListInterface1 addList(MyLinkedList ls, MyLinkedList ll);
	public MyLinkedList findElements(MyLinkedList ll, int index);
}
