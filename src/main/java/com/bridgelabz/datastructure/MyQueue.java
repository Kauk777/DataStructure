package com.bridgelabz.datastructure;

public class MyQueue {
	private MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}

	public void printStack() {
		myLinkedList.printMyNodes();	
	}

	public INode front() {
		return myLinkedList.head;
	}
	
}
