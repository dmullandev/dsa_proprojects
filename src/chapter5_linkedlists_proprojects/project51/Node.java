package chapter5_linkedlists_proprojects.project51;

public class Node {
	public int value;
	public Node next;
	
	public Node(int v) {
		value = v;
		next = null;
	}
	
	public void displayNode() {
		System.out.print(value + " ");
	}
}
