package chapter5_linkedlists_proprojects.project53;

//A circular list is a linked list in which the the last link points back to the first link.
//There are many ways to design a circular list. Sometimes there is a pointer to the "start"
//of the list. 

//However, this makes the list less like a real circle and more like an
//ordinary list that has its end attached to its beginning. Make a class for a
//singly linked circular list that has no end and no beginning.

//The only access to the list is a single reference, current, that can point to any link on the list.
//This reference can move around the list as needed.
//(See programming project 5.5 for a situation in which a circular list is ideally suited.)

//Your list should handle insertion, searching and deletion. You may find it convenient if
//these operations take place one link downstream of the link pointed to by current. 
//(Because the upstream link is singly linked, you can't get at it without going all the way around
//the circle.) You should also be able to display the list (Although you'll need to break the circle at some arbitrary point
//to print it on the screen. A step() method that moves current along to the next link might come in handy too.

public class CircularList {
	private Node first;
	private Node last;
	public Node current;
	private int nItems;
	
	public CircularList() {
		first = null;
		last = null;
		current = first;
		nItems = 0;
	}

	public int size() {
		return nItems;
	}
	
	public void display() {
		Node temp = first;
		while(temp.next != first) {
			temp.displayNode();
			temp = temp.next;
		}
		temp.displayNode();
	}
	
	public void insert(int value) {
		Node newNode = new Node(value);
		if(first==null) {
			first = newNode;
			last = newNode;
			last.next = first;
			current = first;
		}else if(first==last){
			current.next = newNode;
			last = newNode;
			newNode.next = first;
		}else if(current.next == last) {
			newNode.next = last;
			current.next = newNode;
		}else if(current.next == first) {
			newNode.next = first;
			last.next = newNode;
			last = newNode;
		}else {
			newNode.next = current.next;
			current.next = newNode;
		}
		nItems++;
	}
	
	public Node remove() {
		Node temp;
		if(current.next==null) {//last node
			temp = current;
			first = null;
			last = null;
			current = null;
		}else if(current.next == last) {//if current before last
			temp = last;
			current.next = first;
			last = current;
		}else if(current.next == first) {//if current is last
			temp = first;
			first = first.next;
			current.next = first;
		}else {
			temp = current.next;
			current.next = current.next.next;
		}
		temp.next = null;
		return temp;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void peek() {
		System.out.println(current.value);
	}
	
	public void step() {
		current = current.next;
	}
}
