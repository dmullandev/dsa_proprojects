package chapter3_simplesorting_proprojects.project35;

//Modify the insertionSort() method in insertSort.java (Listing 3.3)  so it counts the number
//of copies and the number of comparisons, you'll need to break up the double
//condition in the inner while loop. Use this program to measure the number of copies
//and comparisons for different amounts of inversely sorted data. Do the results
//verify O(N2) efficiency? Do the same for almost-sorted data (only a few items out of place).
//What can you deduce about the efficiency of this algorithm for almost-sorted data?

public class ArrayIns {
	private long[] a;
	private int nElems;
	
	public ArrayIns(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for(int j=0; j<nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
	
	public void insertionSort() {
		int in, out;
		
		int copies = 0, comparisons = 0;
		
		for(out=1; out<nElems; out++) {
			comparisons++;
			long temp = a[out];
			copies++;
			in = out;
			copies++;
			while(in>0 && a[in-1] >= temp) {
				comparisons+=2;
				a[in] = a[in-1];
				copies++;
				--in;
			}
			a[in] = temp;
			copies++;
		}
	}
}
