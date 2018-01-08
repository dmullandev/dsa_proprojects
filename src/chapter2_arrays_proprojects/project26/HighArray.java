package chapter2_arrays_proprojects.project26;

//2.6 Write a noDups() method for the HighArray class
//of the highArray.java program (listing 2.3). This method should remove
//all duplicates from the array. That is, if three items with the
//key 17 appear in the array, noDups() should remove two of them.
//Don't worry about maintaining the order items and overwrite
//any duplicates with a null (or a distinctive value that isn't
//used for real keys). Then remove all the nulls. Of course,
// the array size will be reduced.


public class HighArray {
	private long[] a;
	private int nElems;
	
	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public boolean find(long searchKey) {
		int j;
		for(j=0; j<nElems;j++) {
			if(a[j] == searchKey) {
				break;
			}
		}
		if(j==nElems) {
			return false;
		}else {
			return true;
		}
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public boolean delete(long value) {
		int j;
		for(j=0; j<nElems; j++) {
			if(value == a[j]) {
				break;
			}
		}
		if(j==nElems) {
			return false;
		}else {
			for(int k=j; k<nElems;k++) {
				a[k] = a[k+1];
			}
			nElems--;
			return true;
		}
	}
	
	public void display() {
		for(int j=0;j<nElems;j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println(" ");
	}
}
