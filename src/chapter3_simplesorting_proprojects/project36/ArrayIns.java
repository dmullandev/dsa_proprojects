package chapter3_simplesorting_proprojects.project36;

//Here's an interesting way to remove the duplicates from an array. The insertion sort uses a loop-within-a-loop
//algorithm that compares every item in the array with every other item.
//If you want to remove duplicates, this is one way to start. (See also Exercise 2.6 in Chapter 2.)
//Modify the inosertionSort() method in the insertSort.java program so that it removes duplicates as it sorts.
//Here's one approach: When a duplicate is found, write over one of the duplicated items with a key value
//less than any normally used(such as -1, if all the normal keys are positive).
//Then the normal insertion sort algorithm, treating this new key like any other item, will put it at index 0.
//From now on the algorithm can ignore this item. The next duplicate will go at index 1, and so on.
//When the sort is finished, all the removed dups (now represented by -1 values) will be found
//at the beginning of the array. The array can then be resized and shifted down so it starts at 0.

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
		for(int j=0;j<nElems;j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
	
	public void insertionSort() { //project36 duplicates marked during sort, size reduced and array items shifted down
		int in,out;
		
		for(out=1; out<nElems;out++) {

			if(a[out]==a[out-1] || a[out] == a[out+1]) { //mark
				a[out] = -1;
			}
			long temp = a[out];
			in = out;
			while(in>0 && a[in-1] >=temp) {
				a[in] = a[in-1];
				--in;
			}
			
			a[in] = temp;
		}
		
		if(a[0] == -1) {//shift array contents down, removing -1 (dupes)
			int k=0; 	
			while(a[k] == -1) { //find non-duplicates beginning
				k++;
			}
			nElems-=k;
			for(int i=0; i<nElems; i++,k++) { //might be better to copy into new array then replace original
				a[i] = a[k];
			}
			
		}
	}
}
