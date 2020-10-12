package com.bridgelabz.datastructure;

import org.junit.Test;
import org.junit.Assert;

public class MyBinaryTreeTest {

	@Test
	public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
	
	@Test
	public void givenNumbersWhenAddedToBSTShouldReturnSize() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		int arr[]= {56,30,70,22,40,60,95,65,63,67,11,3,16};
		for(Integer i:arr)
			myBinaryTree.add(i);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(13, size);
	}

}
