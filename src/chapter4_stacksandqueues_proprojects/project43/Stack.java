package chapter4_stacksandqueues_proprojects.project43;

//Write a program that implements a stack class that is based on the dequeue class in Programming
//project 4.2. This stack class should have the same methods and capabilities as the StackX class
//in the stack.java program (Listing 4.1).

public class Stack {
	
Dequeue dq;
	public Stack(int size) {
		int maxSize = size;
		dq = new Dequeue(maxSize);
	}
	
	public boolean isEmpty() {
		return dq.isEmpty();
	}
	
	public boolean isFull() {
		return dq.isFull();
	}
	
	public boolean push(long value) {
		return dq.insertRight(value);
	}
	
	public long pop() {
		return dq.removeRight();
	}
	
	public long peek() {
		return dq.peekRear();
	}
}
