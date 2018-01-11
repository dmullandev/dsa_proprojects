package chapter3_simplesorting_proprojects.project33;

public class InsertSortApp {

	public static void main(String[] args) {
		int maxSize = 100;
		ArrayIns arr;
		arr = new ArrayIns(maxSize);
		
		arr.insert(1);
		arr.insert(10);
		arr.insert(1);
		arr.insert(2);
		arr.insert(9);
		arr.insert(1);
		arr.insert(2);
		arr.insert(7);
		arr.insert(8);
		arr.insert(9);
		
		arr.display();
		
		arr.insertionSort();
		
		arr.display();
		
		System.out.println(arr.median());
		
		arr.noDups();
		
		arr.display();
	}

}
