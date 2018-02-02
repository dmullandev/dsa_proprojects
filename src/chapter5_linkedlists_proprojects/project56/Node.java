package chapter5_linkedlists_proprojects.project56;

public class Node {
private int value;
public Node next;
public Node down;
	public Node(int v) {
		value = v;
		next = null;
	}
	
	public void displayNode() {
		System.out.print(value + " ");
	}
	
	public int getValue() {
		return value;
	}
	private boolean setValue(int v) {
		if(v>0) {
			value = v;
			return true;
		}
		return false;
	}
	
	public boolean insert(int v) {
		return setValue(v);
	}
}
