package chapter3_simplesorting_proprojects.project32;

//Add a method called median() to the ArrayIns class in the insertSort.java program
//(Listing 3.3). This method should return the median value in the array.
//(Recall that in a group of numbers half are larger than the median and half are
//are smaller.) Do it the easy way.

//To the insertSort.java program (Listing 3.3), add a method called noDups() that removes
//duplicates from a previously sorte array without disrupting the order.
//(You can use the insertionSort() method to sort the data, or you can simply use main()
//to insert the data in sorted order.) One can imagine schemes in which all the items
//from the place where a duplicate was discovered to the end
//of the array would be shifted down one space every time a duplicate was
//discovered, but this would lead to slow O(N2) time, at least when there were a
//lot of duplicates. In your algorithm, make sure no item is moved more than once,
//no matter how many duplicates there are. This will give you an algorithm with O(N) time.

public class ArrayIns {
	private long[] a;
	private int nElems;
	
	public ArrayIns(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public long median() {
		return a[nElems/2];
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for(int j=0;j<nElems;j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
	
	public void insertionSort() {
		int in,out;
		
		for(out=1; out<nElems;out++) {
			long temp = a[out];
			in = out;
			
			while(in>0 && a[in-1] >=temp) {
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}
	
	
}
