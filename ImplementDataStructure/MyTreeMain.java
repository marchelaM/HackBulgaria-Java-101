package ImplementDataStructure;

import week03_DataStructure.MyTree;

public class MyTreeMain {

	public static void main(String[] args) {
		
		MyTree tree = new MyTree();
		
		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(70);
		tree.insert(30);
		tree.insert(15);
		tree.insert(2);
		tree.insert(18);
		tree.insert(85);
		
		
		System.out.println(tree.find(30));
		tree.display(tree.root);
		System.out.println();
		tree.remove(15);
		tree.display(tree.root);
		
		

	}

}
