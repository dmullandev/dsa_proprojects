package chapter2_arrays_proprojects.project25;

import java.util.Random;

//Add a merge() method to the OrdArray class in the orderedArray.java program (listing 2.4) so that you can 
//merge two ordered source arrays into an ordered destination array. Write code in main() that inserts some 
//random numbers into the two source arrays, invokes merge(), and displays the contents
//of the resulting destination array. The source arrays may hold different
//numbers of data items. In your algorithm you will need to compare the keys of
//the source arrays, picking the smallest one to copy to the destination.
//You'll also need to handle the situation when one source array exhausts its content before the other

public class OrderedApp {

	public static void main(String[] args) {

		Random rand = new Random(); //random number generator
		
		int maxsize = rand.nextInt(20); 
		int maxsize2 = rand.nextInt(20);
		
		OrdArray arr = new OrdArray(maxsize); //source array 1
		OrdArray arr2 = new OrdArray(maxsize2); //source array 2
		OrdArray arr3 = new OrdArray(maxsize + maxsize); //destination array

		for(int k=0;k<maxsize;k++) {
			arr.insert(rand.nextInt(99));
		}
		arr.display();
		
		for(int k=0;k<maxsize2;k++) {
			arr2.insert(rand.nextInt(99));
		}
		arr2.display();
		
		arr3.merge(arr, arr2);
		arr3.display();
		
	}

}
