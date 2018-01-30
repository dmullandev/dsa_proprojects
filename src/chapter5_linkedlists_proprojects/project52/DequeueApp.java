package chapter5_linkedlists_proprojects.project52;

public class DequeueApp {

	public static void main(String[] args) {
		Dequeue dq = new Dequeue();
		Node temp;
		
		dq.insertLeft(10);
		dq.insertLeft(20);
		dq.insertLeft(30);
		dq.insertLeft(40);
		
		temp = dq.removeLeft();
		System.out.print("RemovedLeft: " );
		temp.display();
		
		dq.insertRight(50);
		dq.insertRight(60);
		dq.insertRight(70);
		dq.insertRight(80);
		
		temp = dq.removeRight();
		System.out.print("RemovedRight: " );
		temp.display();
		
		
		System.out.println("Size: " + dq.size());
		
		System.out.println("Front: " + dq.peekFront().value);
		System.out.println("Rear: " + dq.peekRear().value);
		
		if(!dq.isEmpty()) {
			temp = dq.removeLeft();
			while(temp != null) {
				temp.display();
				temp = dq.removeLeft();
			}
		}	
	}
}
