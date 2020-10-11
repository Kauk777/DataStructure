package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	@Test
	public void given3NumbersWhenAddedToQueueShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);

		myQueue.printStack();
		INode front = myQueue.front();
		Assert.assertEquals(myFirstNode, front);
	}

	@Test
	public void given3NumbersWhenDeQueueShouldMatchNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode dequeue = myQueue.dequeue();
		myQueue.printStack();
		Assert.assertEquals(myFirstNode, dequeue);
	}

}
