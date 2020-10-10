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
	
	public<K> void insertAfterNode(K keyValue) {
		INode prevNode=search(30);
		if(prevNode==null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		MyNode newNode=new MyNode(40);
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
		//tempNode=tempNode.getNext();
		tempNode.setNext(null);
		return tempNode;
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
