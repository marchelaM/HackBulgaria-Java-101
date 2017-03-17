package ImplementDataStructure;

import org.omg.PortableServer.IMPLICIT_ACTIVATION_POLICY_ID;

public class MainMyBinarySearch {
/*
	public static void main(String[] args) {
		
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		
		bst.addNode("Ivanov", 50);
		bst.addNode("Grigorov", 90);
		bst.addNode("Minchev", 30);
		bst.addNode("Andonov", 40);
		
		System.out.println(bst.find(30));
		System.out.println(bst.find(100));

	}*/
	private Node root;
	
	private class Node{
		
		private int element;
		private Node left;
		private Node right;
		
		public Node(int element){
			
			this.element = element;
		}
	}
	
	public void add(int newElement){
		
		if (root == null) {
			//set root
		}else{
			if (newElement < root.element) {
				if (root.left == null) {
					root.right = new Node(newElement);
				}
			}else if(newElement > root.element){
				if (root.right == null) {
					root.right = new Node(newElement);
					
				}
			}
		}
		
		
	}
	
	private void addRecursive(int newElement, Node currentNode){
		
		if (newElement < currentNode.element) {
			if (currentNode.left == null) {
				currentNode.right = new Node(newElement);
			}else{
				addRecursive(newElement, currentNode.left);
			}
		}else if(newElement > currentNode.element){
			if (currentNode.right == null) {
				currentNode.right = new Node(newElement);
				
			}else{
				addRecursive(newElement, currentNode.right);
			}
		}
	}

}
