package chapter4_stacksandqueues_proprojects.project42;

public class DequeueApp {

	public static void main(String[] args) {
		int maxSize = 5;
		Dequeue dq = new Dequeue(maxSize);
		
		dq.insertLeft(10);
		dq.insertLeft(20);
		dq.insertLeft(30);
		dq.insertLeft(40);
		
		System.out.println(dq.removeLeft());
		System.out.println(dq.removeLeft());
		System.out.println(dq.removeLeft());
		
		dq.insertRight(50);
		dq.insertRight(60);
		dq.insertRight(70);
		dq.insertRight(80);
	}

}
