package com.bridgelabz.datastructure;

public interface INode<K> {
	K getkey();
	void setKey(K key);
	
	INode<K> getNext();
	void setNext(INode<K> next);

}
