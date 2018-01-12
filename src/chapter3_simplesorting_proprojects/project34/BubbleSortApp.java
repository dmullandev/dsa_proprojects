package chapter3_simplesorting_proprojects.project34;

import java.util.Random;

public class BubbleSortApp {

	public static void main(String[] args) {
		int maxSize = 50;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);
		Random rand = new Random();
		
		for(int i=0;i<maxSize;i++) {
			long num = rand.nextInt(100);
			if(num > 0) {
				arr.insert(num);
			}
		}
		
		arr.display();
		
		arr.OddEvenSort();
		
		arr.display();
	}

}
