package com.bridgelabz.datastructure;

public class MyNode<K> implements INode<K> {

	private K key;
	private INode<K> next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public INode<K> getNext() {
		return next;
	}
	
	@Override
	public K getkey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	public void setNext(INode<K> next) {
		this.next = next;
	}

	

}
