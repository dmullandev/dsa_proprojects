package chapter4_stacksandqueues_proprojects.project45;
import java.util.Random;

public class Customer {
private int groceries;
Random rand = new Random();

	public Customer() {
		int min = 1;
		int max = 4;
		groceries = rand.nextInt(max) + min;
	}
	
	public int getGroceries() {
		return groceries;
	}
	
	public int decrementGroceries() {
		if(groceries==1) {
			groceries = 1;
			return 1;
		}
		int temp = groceries--;
		return groceries;
	}
}
