package chapter4_stacksandqueues_proprojects.project44;

public class PriorityQApp {

	public static void main(String[] args) {
		PriorityQ thePQ = new PriorityQ(5);
		
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		thePQ.displayPriorityQ();
	}
}
