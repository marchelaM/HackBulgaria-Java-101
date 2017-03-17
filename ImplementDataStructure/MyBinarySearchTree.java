package ImplementDataStructure;


public class MyBinarySearchTree<T extends Comparable<T>> implements MyBinarySearchTreeInterface<T> {
	
	private Node<T> root;
	
	private class Node<T> {
		int key;
		String name;
		Node<T> leftChild;
		Node <T>rightChild;

		public Node(String name, int key) {
			this.name = name;
			this.key = key;
		}

		public String toString() {
			return name + " has the key " + key;
		}

	}

	public void addNode(String name, int key) {

		Node newNode = new Node(name, key);

		if (root == null) {
			root = newNode;
		} else if (root != null) {
			Node focusNode = root;
			Node parent;
			while (true) {

				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}

				}
			}

		}

	}

	@Override
	public void insert(T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean find(int key) {
		
		// Start at the top of the tree
		Node focusNode = root;
		
		//while we haven't find the Node keep looking
		while (focusNode.key != key) {
			
			// If we should search to the left
			if (key < focusNode.key) {
				
				// Shift the focus Node to the left child
				focusNode = focusNode.leftChild;

			}else{
				
				// Shift the focus Node to the right child
				focusNode = focusNode.rightChild;

			}
			// The node wasn't found
			
			if (focusNode == null) {
				
				return false;
				
			}


			
		}

		
		return true;
	}
}


