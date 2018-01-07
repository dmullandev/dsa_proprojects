package chapter2_arrays_proprojects.project25;

//Modify the orderedArray.java program (Listing 2.4) so that the insert() and delete() routines,
//as well as find(), use binary search, as suggested in the text.

public class OrdArray {
	private long[] a;
	private int nElems;
	
	public OrdArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public int size() {
		return nElems;
	}
	
	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		
		while(true) {
			curIn = (lowerBound + upperBound) /2;
			
			if(a[curIn]==searchKey) {
				return curIn;
			}else if(lowerBound > upperBound) {
				return nElems;
			}else {
				if(a[curIn] < searchKey) {
					lowerBound = curIn + 1;
				}else {
					upperBound = curIn -1;
				}
			}
		}
	}
	
	public void insert(long value) {
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn = 0;
		
		while(true) {
			
			if(lowerBound > upperBound) { // base case
				break;
			}			
			curIn = (lowerBound + upperBound) /2;
			
			if(a[curIn] < value) {
				lowerBound = curIn + 1;
				curIn++;
			}else {
				upperBound = curIn - 1;
			}						
		}
		for(int k=nElems; k>curIn; k--) {
			a[k] = a[k-1];
		}
		a[curIn] = value;
		nElems++;
	}
	
	
	public boolean delete(long value) {	
		if (nElems==0) { // base case
			return false;
		}
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		
		while(true) {
			curIn = (lowerBound + upperBound) /2;
			
			if(a[curIn]==value) {
				break;
			}else if(lowerBound > upperBound) {
				return false;
			}else {
				if(a[curIn] < value) {
					lowerBound = curIn + 1;
				}else {
					upperBound = curIn -1;
				}
			}
		}
		for(int k=curIn; k<nElems; k++) {
			a[k] = a[k+1];
		}
		nElems--;
		return true;
	}
	
	public void display() {
		for(int j=0; j<nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
}
