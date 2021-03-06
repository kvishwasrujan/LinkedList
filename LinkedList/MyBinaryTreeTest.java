package com.Capgemini.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

class MyBinaryTreeTest {
	@Test
	void whenAddedThreeNumbersItShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree=new 	MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size=myBinaryTree.getSize();
		Assert.assertEquals(3,size);
	}
	@Test
	public void printingABinaryTreeAsShown() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(65);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		int size = myBinaryTree.getSize();
		assertEquals(13, size);
	}
	@Test
	public void searchForParticularKey() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(65);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		MyBinaryNode<Integer> reqNum =myBinaryTree.search(63);
		assertEquals(63,(int)reqNum.key);
	}
}
