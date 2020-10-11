package com.bridgelabz.datastructure;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail=null;
	}

	public void add(INode newNode) {
		if(this.tail==null)
			this.tail=newNode;
		if(this.head==null)
			this.head=newNode;
		else {
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode myNode) {
		if(this.head==null)
			this.head=myNode;
		if(this.tail==null)
			this.tail=myNode;
		else {
			this.tail.setNext(myNode);
			this.tail=myNode;
		}
	}
	
	public void insert(INode myNode, INode newNode) {
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public<K> void insertAfterNode(K prevValue, K keyValue) {
		INode prevNode=search(prevValue);
		if(prevNode==null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		MyNode<K> newNode=new MyNode<>(keyValue);
		insert(prevNode,newNode);
	}
	
	public INode pop() {
		INode tempNode=this.head;
		this.head=head.getNext();
		return tempNode;
	}
	
	public INode popLast() {
		INode tempNode=head;
		while(!tempNode.getNext().equals(tail))
			tempNode=tempNode.getNext();
		this.tail=tempNode;
		tempNode.setNext(null);
		return tempNode;
	}
	
	public<K> void deleteNode(K keyValue) {
		INode tempNode=head, prevNode=null;
		if(tempNode!=null && tempNode.getkey()==keyValue) {
			this.head=tempNode.getNext();
			return;
		}
		while(tempNode!=null && tempNode.getkey()!=keyValue) {
			prevNode=tempNode;
			tempNode=tempNode.getNext();
		}
		if(tempNode.getkey()==null) // If key is not present in linked list
			return;
		prevNode.setNext(tempNode.getNext());
	}
	
	public<K> INode search(K nodeValue) {
		INode currentNode=head;
		if(this.head==null)
			System.out.println("Linked Lst is empty");
		else {
			while(currentNode!=null) {
				if(currentNode.getkey()==nodeValue)
					return currentNode;
				currentNode=currentNode.getNext();
			}
		}
		return currentNode;
	}
	
	public void size() {
		INode tempNode=head;
		int count=0;
		while(tempNode!=null) {
			count++;
			tempNode=tempNode.getNext();
		}
		System.out.println("Linked List size: "+count);
	}
	
	public void sortedLinkedList() {
		INode currentNode=head, indexNode=null;
		int temp;
		if(this.head==null)
			return;
		while(currentNode!=null) {
			indexNode=currentNode.getNext();
			while(indexNode!=null) {
				if((int)currentNode.getkey()>(int)indexNode.getkey()) {
					temp=(int)currentNode.getkey();
					currentNode.setKey(indexNode.getkey());
					indexNode.setKey(temp);
				}
				indexNode=indexNode.getNext();
			}
			currentNode=currentNode.getNext();
		}
	}
	
	public void printMyNodes() {
		if(this.head==null)
			return;
		INode node=head;
		while(true) {
			System.out.print(node.getkey());
			if(node.getNext()!=null) {
				System.out.print("->");
				node=node.getNext();
			}
			else
				break;
		}
		System.out.print("\n");
	}

}
