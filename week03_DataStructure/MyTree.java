package week03_DataStructure;

import java.beans.DefaultPersistenceDelegate;

public class MyTree {
	
	public Node root;
	
	private class Node{
		
		private int element;
		private Node left;
		private Node right;
		
		public Node(int element){
			this.element = element;
			
		}
	}
	
	public void insert(int newElement){
		
		if (root == null) {
			
			root = new Node(newElement);
		}else{
			
			addRecursive(newElement, root);
		}
	}
	
	private void addRecursive(int newElement, Node currentNode){
		
		if(newElement < currentNode.element){
			if (currentNode.left == null) {
				
				currentNode.left = new Node(newElement);
			}else{
				
				addRecursive(newElement, currentNode.left);
			}
			
			
		}else if (newElement > currentNode.element) {
			
			if (currentNode.right == null) {
				
				currentNode.right = new Node(newElement);
			}else{
				
				addRecursive(newElement, currentNode.right);
			}
		}
		
		
	}
	
	public boolean find(int newElement){
		Node currentNode = root;
		while (currentNode != null) {
			if (newElement == currentNode.element) {
				
				return true;
				
			}else if (newElement < currentNode.element) {
				
				currentNode = currentNode.left;
			}else{
				
				currentNode = currentNode.right;
			}
		}	
		
		return false;
	}
	
	public void remove(int newElement){
		
		if (root == null) {
			System.out.println("There is an empty root");
		}else{
			
			removeRecursive(newElement, root);
		}
		
	}
	
	private Node removeRecursive(int newElement, Node currentNode){
		
		Node parent = currentNode;
		if (newElement < currentNode.element) {
			
			parent = currentNode.left;
			currentNode.left = removeRecursive(newElement, currentNode.left);
			
		}else if (newElement > currentNode.element) {
			
			parent = currentNode.right;
			currentNode.right = removeRecursive(newElement, currentNode.right);
			
		}else{
			
			if (currentNode.left == null && currentNode.right == null) {
				
				parent = null;
				
			}else if (currentNode.right == null) {
				
				parent = currentNode.left;
				
			}else if (currentNode.left == null) {
				
				parent = currentNode.right;
				
			}else{
				
				Node temp = findMinRight(parent.right);
				parent.element = temp.element;
				parent.right = removeRecursive(temp.element, currentNode.right);
			}
			
		}
		
		
		return parent;
	}
	
	private Node findMinRight(Node currentNode){
		while(currentNode.left != null){
			
			currentNode = currentNode.right;
		}
		
		return currentNode;
	}
	
	
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.element);
			display(root.right);
		}
	}
	


}
