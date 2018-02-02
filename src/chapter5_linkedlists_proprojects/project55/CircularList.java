package chapter5_linkedlists_proprojects.project55;

//Create an application that uses a circular linked list (like that in programming project 5.3)
//to model this problem. inputs are the number of people in the circle, the number used for counting off,
//and the number of the person where counting starts (usually 1).
//The output is the list of the persons
//being eliminated. When a person drops out of the circle, counting starts again from the person
//who was on his left (assuming you go around clockwise).
//Here's an example. There are seven people
//numbered 1 through 7, and you start at 1 and count off by threes. People will be eliminated 
//in the order 4, 1, 6, 5, 7, 3. Number 2 will be left.

public class CircularList {
Node first;
Node last;
Node current;
private int nItems;


	public CircularList() {
		first = null;
		last = null;
		current = null;
		nItems = 0;		
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
		}else {
			newNode.next = first;
			last.next = newNode;
			last = newNode;
		}			
		nItems++;
	}
	
	public void remove() {
		while(nItems>0){
			int counter = 1;
			while(counter <= 2) {
				current = current.next;
				++counter;
			}
			if(current.next == last) {
				current.next = first;
				last = current;
			}else if(current.next == first) {
				first = first.next;
				current.next = first;
			}else {
				Node temp = current.next;
				current.next = current.next.next;
				temp.next = null;
			}
			nItems--;
		}
	}
}
