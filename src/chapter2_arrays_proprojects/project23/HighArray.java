package chapter2_arrays_proprojects.project23;

public class HighArray {
	private long[] a;
	private int nElems;
	
	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public boolean find(long searchKey) {
		int j;
		
		for(j=0; j<nElems; j++) {
			if(a[j] == searchKey) {
				break;
			}
		}
		if(j == nElems) {
			return false;
		}else {
			return true;
		}		
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public long returnMax() {
		long max;
		if(nElems == 0) {
			return -1;
		}else {
			max = removeMax();
		}
		return max;
	}
	public long removeMax() {
		long[] tmpa = a;
		int j;
		
		for(j=0; j<nElems; j++) { //O(n2)
			for(int k=j+1; k<nElems; k++) {
				if(tmpa[j] > tmpa[k] ) { //swap them
					long temp;
					temp = tmpa[j];
					tmpa[j] = tmpa[k];
					tmpa[k] = temp;
				}
			}
		}
		a = tmpa; //copy array back
		nElems--;
		return a[nElems];
	}
	
	public boolean delete(long value) {
		int j;
		
		for(j = 0; j<nElems; j++) {
			if(value == a[j]) {
				break;
			}
		}
		if(j==nElems) {
			return false;
		}else {
			for(int k=j; k<nElems; k++) {
				a[k] = a[k+1];
			}
			nElems--;
			return true;
		}
		
	}
	
	public void display() {
		for(int j=0; j<nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");		
	}
}
