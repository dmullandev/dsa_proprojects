package chapter3_simplesorting_proprojects.project32;

//Add a method called median() to the ArrayIns class in the insertSort.java program
//(Listing 3.3). This method should return the median value in the array.
//(Recall that in a group of numbers half are larger than the median and half are
//are smaller.) Do it the easy way.

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
