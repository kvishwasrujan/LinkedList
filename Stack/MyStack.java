package com.Capgemini.Stack;
import com.Capgemini.LinkedList.*;
public class MyStack {
private final MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peek() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}

	public INode pop() {
		return myLinkedList.pop();
	}
	
	public INode peak() {
		return myLinkedList.head;
	}
}
