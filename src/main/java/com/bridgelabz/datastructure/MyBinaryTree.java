package com.bridgelabz.datastructure;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}
	
	public MyBinaryNode<K> searchRecursive(MyBinaryNode<K> node, K key) {
		if(node==null)
			return node;
		int compareResult = key.compareTo(node.key);
		if(compareResult == 0)
			return node;
		if(compareResult<0)
			return searchRecursive(node.left,key);
		else
			return searchRecursive(node.right,key);	
	}
	
	public boolean searchRecursive(K key) {
		this.root=this.searchRecursive(root,key);
		if(root!=null)
			return true;
		else
			return false;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

}
