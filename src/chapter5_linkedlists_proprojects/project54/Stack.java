package chapter5_linkedlists_proprojects.project54;

//Implement a stack class based on the circular list of Programming Project 5.3.
//This exercise is not too difficult. (However, implementing a queue can be harder,
//unless you make the circular list doubly linked.)

public class Stack {
CircularList theClist;

	public Stack() {
		theClist = new CircularList();
	}
	
	public boolean isEmpty() {
		return theClist.isEmpty();
	}
	
	public boolean search(int value) {
		return theClist.find(value);
	}
	
	public int size() {
		return theClist.size();
	}
	
	public Node pop() {
		return theClist.removeStack();
	}
	
	public void push(int value) {
		theClist.insertStack(value);
	}
	
	public void peek() {
		theClist.peek();
	}
	
	public void display() {
		theClist.display();
	}	
}
