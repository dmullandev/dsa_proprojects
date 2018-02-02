package chapter5_linkedlists_proprojects.project56;

public class Node {
private int value;
public Node next;
	public Node(int v) {
		value = v;
		next = null;
	}
	
	public void displayNode() {
		System.out.print(value + " ");
	}
}
