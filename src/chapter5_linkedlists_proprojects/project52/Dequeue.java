package chapter5_linkedlists_proprojects.project52;

//Implement a deque on a doubly linked list.
//See programming project 4.2 in the preceding chapter.
//The user should be able to carry out the normal operations on the deque.

public class Dequeue {
	private Node first;
	private Node last;
	int nItems;
	
	public Dequeue() {
		first=null;
		last=null;
		nItems = 0;		
	}
	
	public int size() {
		return nItems;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public Node peekFront() {
		if(isEmpty()) {
			return null;
		}
		Node temp = first;
		return temp;
	}
	
	public Node peekRear() {
		if(isEmpty()) {
			return null;
		}
		Node temp = last;
		return temp;
	}
	
	public void insertLeft(int value) {
		Node newNode = new Node(value);
		
		if(first==null) {
			first = newNode;
			last = newNode;
		}else {
			newNode.next = first;
			first.previous = newNode;
			first = newNode;
		}			
		nItems++;
	}


	public void insertRight(int value) {
		Node newNode = new Node(value);
		
		if(last==null) {
			first = newNode;
			last = newNode;
		}else {
			last.next = newNode;
			newNode.previous = last;
			last = newNode;
		}
		nItems++;
	}
	
	public Node removeLeft() {
		if (isEmpty()){
			return null;
		}
		Node temp = first;
		--nItems;
		if(first.next == null) {
			first = null;
			last = null;
			return temp;
		}
		first.next.previous = null;
		first = first.next;
		return temp;
	}
	
	public Node removeRight() {
		if(last==null) {
			return null;
		}
		Node temp = last;
		--nItems;
		if(last.previous == null) {
			first = null;
			last = null;
			return temp;
		}
		last.previous.next = null;
		last = last.previous;
		return temp;
	}
}