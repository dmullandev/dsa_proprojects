package chapter3_simplesorting_proprojects.project34;

//Another simple sort is the odd-even sort. The idea is to repeatedly make two passes through the array.
//On the first pass you look at all the pairs of items, a[j] and a[j+1], where j is odd(j= 1,3,5,...)
//If their key values are out of order, you swap them. On the second pass you do the same for all the even
//values (j=2,4,6,...). You do these two passes repeatedly until the array is sorted.

//Replace the bubbleSort() method in bubbleSort.java (Listing 3.1) with an OddEvenSort() method.
//Make sure it works for varying amounts of data
//You'll need to figure out how many times to do the two passes.

public class ArrayBub {
	private long[] a;
	private int nElems;
	
	public ArrayBub(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void OddEvenSort() {
		for(int i=0; i<nElems; i++) {
			if(i % 2 == 0) { //i is even
				for(int j=2; j<nElems; j+=2) {
					if(a[j] < a[j-1]) {
						long temp = a[j];
						a[j] = a[j-1];
						a[j-1] = temp;
					}
				}
			}else {
				for(int j=1; j<nElems;j+=2) {
					if(a[j] < a[j-1]) {
						long temp = a[j];
						a[j] = a[j-1];
						a[j-1] = temp;
					}
				}
			}
		}
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for(int i=0;i<nElems;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
	
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
