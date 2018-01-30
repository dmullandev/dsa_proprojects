package chapter5_linkedlists_proprojects.project52;

public class Node {
	public int value;
	public Node next;
	public Node previous;
	
	public Node(int v) {
		value = v;
		next = null;
	}
	
	public void display() {
		System.out.print(value + " ");
	}
}
