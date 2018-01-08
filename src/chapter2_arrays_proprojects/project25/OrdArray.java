package chapter2_arrays_proprojects.project25;

//Modify the orderedArray.java program (Listing 2.4) so that the insert() and delete() routines,
//as well as find(), use binary search, as suggested in the text.

//Add a merge() method to the OrdArray class in the orderedArray.java program (listing 2.4) so that you can 
//merge two ordered source arrays into an ordered destination array. Write code in main() that inserts some 
//random numbers into the two source arrays, invokes merge(), and displays the contents
//of the resulting destination array. The source arrays may hold different
//numbers of data items. In your algorithm you will need to compare the keys of
//the source arrays, picking the smallest one to copy to the destination.
//You'll also need to handle the situation when one source array exhausts its content before the other

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
	
	public void merge(OrdArray sourceArr, OrdArray sourceArr2) {
		int size1 = sourceArr.size();
		int size2 = sourceArr2.size();
		int sourceArrIndex = 0, sourceArr2Index = 0;
		
		while( sourceArrIndex < size1 && sourceArr2Index < size2) { //while both arrays not empty
			if(sourceArr.a[sourceArrIndex] < sourceArr2.a[sourceArr2Index]) {
				a[nElems++] = sourceArr.a[sourceArrIndex++];
			}else {
				a[nElems++] = sourceArr2.a[sourceArr2Index++];
			}
		}
		
		while (sourceArrIndex < size1) { //until first source array empty
			a[nElems++] = sourceArr.a[sourceArrIndex++];
		}
		while (sourceArr2Index < size2) { //until second source array empty
			a[nElems++] = sourceArr2.a[sourceArr2Index++];
		}
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
