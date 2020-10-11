package com.Capgemini.Stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.Capgemini.LinkedList.*;
class MyStackTest {
	@Test
	public void StackNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peek();
		myStack.printStack();
		assertEquals(myThirdNode, myNode);
	}
	

}
