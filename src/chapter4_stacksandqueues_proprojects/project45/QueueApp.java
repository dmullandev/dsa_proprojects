package chapter4_stacksandqueues_proprojects.project45;

public class QueueApp {

	public static void main(String[] args) {
		
		Queue theQ = new Queue(5);
		
		theQ.insert(10);
		theQ.insert(30);
		theQ.insert(50);
		theQ.insert(70);
		
		theQ.displayQueue();
	}

}
