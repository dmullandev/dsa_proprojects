package chapter5_linkedlists_proprojects.project55;

public class CircularListApp {

	public static void main(String[] args) {
		CircularList cl = new CircularList();
		
		for(int i=1; i<20; i++ ) {
			cl.insert(i);
		}
		cl.display();
		cl.remove();
		System.out.println();
		cl.display();
	}
}
