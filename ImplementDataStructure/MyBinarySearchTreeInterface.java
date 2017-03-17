package ImplementDataStructure;

import javax.xml.soap.Node;

public interface MyBinarySearchTreeInterface<T extends Comparable<T>> {
	/**
	 * Insert a data entry to the BST
	 * 
	 * null is positive infinity
	 * 
	 * @param data The data entry to insert
	 */
	public void insert(T element) ;
	/**
	 * Recursive add() method helper
	 */
	
	
	public T remove(T element);
	
	public boolean find(int key);

}
