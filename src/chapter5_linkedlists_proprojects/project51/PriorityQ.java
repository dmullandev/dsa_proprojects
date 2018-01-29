package chapter5_linkedlists_proprojects.project51;

//project51 implement a priority queue based on a sorted linked list. The remove operation
//on the priority queue should remove the item with the smallest key.
public class PriorityQ {
	private Node first;
	private Node last;
	private int nItems;
	
	public PriorityQ() {
		first=null;
		last=null;
		nItems=0;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public int getSize() {
		return nItems;
	}
	
	public void display() {
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
	}
	
	public void insert(int value) {
		Node newNode = new Node(value);
		Node current = first;
		Node previous = current;
		if(isEmpty()) {
			first = newNode;
		}else {
			while(current.next != null) {
				if(newNode.value <= current.value) {//break early for sorting
					break;
				}
				previous = current;
				current = current.next;//until end
			}
			if(current.next==null) {//end of list (newNode is largest)
				current.next = newNode;
			}else {
				previous.next = newNode;
				newNode.next = current;
			}			
			nItems++;
		}
	}
	
	public Node remove() {
		if(isEmpty()) {
			return null;
		}

		Node temp = first;
		if(first.next != null) {
			first = first.next;
		}else {
			first = null;
		}
		return temp;
	}
}
