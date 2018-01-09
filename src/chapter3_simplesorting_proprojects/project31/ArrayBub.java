package chapter3_simplesorting_proprojects.project31;

//in the bubblesort.java program (listing 3.1) and the bubblesort workshop applet, the in index always goes from left to right
//finding the largest item and carrying it toward out on the right. modify the bubblesort() method so that it's
//bidirectional. this means the in index will first carry the largest item from left to right as before,
//but when it reaches out, it will reverse and carry the smallest item from right to left. you'll need two outer indexes,
//one on the right (the old out) and another on the left.

public class ArrayBub {
	private long[] a;
	private int nElems;
	
	public ArrayBub(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for(int j=0;j<nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
	
	public void bubbleSort() {
		int out, out2;
		int in = 0;
		
		for(out=nElems-1;out>1;out--) {//forwards
			for(;in<out;in++) {
				if(a[in] > a[in+1]) {
					swap(in,in+1);
				}
			}
			for(in=out-1, out2=0;in>out2;in--) {//reverse
				if(a[in] < a[in-1]) {
					swap(in, in-1);
				}
			}
		}
	}
	
	public void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
