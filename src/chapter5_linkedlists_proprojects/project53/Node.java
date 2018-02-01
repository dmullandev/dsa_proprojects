package chapter5_linkedlists_proprojects.project53;

public class Node {
	public Node next;
	public int value;
	
	public Node(int v) {
		value = v;
		next = null;
	}
	
	public void displayNode() {
		System.out.print(value + " ");
	}
}
