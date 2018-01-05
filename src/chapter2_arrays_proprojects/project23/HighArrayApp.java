package chapter2_arrays_proprojects.project23;

public class HighArrayApp {

	public static void main(String[] args) {
		int maxSize = 100; 
		HighArray arr;
		HighArray arr2;
		arr = new HighArray(maxSize);
		arr2 = new HighArray(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		arr.display();
		
		int searchKey = 35;
		
		if(arr.find(searchKey)) {
			System.out.println("Found " + searchKey);
		}else { 
			System.out.println("Can't find " + searchKey);
		}
		
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);
		
		arr.display();
		
		long temp = 0;
		
		while(temp != -1) { //insert inverse order without modifying HighArray whilst returnMax is returning keys
			temp = arr.returnMax();
			if(temp != -1) {
				arr2.insert(temp);
			}
		}
		arr2.display();
	}

}
