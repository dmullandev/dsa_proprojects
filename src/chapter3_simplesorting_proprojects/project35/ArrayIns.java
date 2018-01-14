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
//random data
//	77 99 44 55 22 88 11 0 66 33 
//	Copies 58 Comparisons 67 Total = 125
//	0 11 22 33 44 55 66 77 88 99
	
//inversely sorted
//	99 88 77 66 55 44 33 22 11 0 
//	Copies 72 Comparisons 90 Total = 162
//	0 11 22 33 44 55 66 77 88 99
	
//partially sorted
//	0 22 11 33 88 55 66 77 44 99 
//	Copies 35 Comparisons 25 Total = 60
//	0 11 22 33 44 55 66 77 88 99 

	
	public void insertionSort() {
		int in, out;
		
		int copies = 0, comparisons = 0;
		
		for(out=1; out<nElems; out++) {
			long temp = a[out];
			copies++;
			in = out;
			copies++;
			while(in>0) {
				if(a[in-1] >= temp) {
					comparisons+=2;
					a[in] = a[in-1];
					copies++;
					--in;
				}else {
					comparisons++;
					break;
				}				
			}
			a[in] = temp;
			copies++;
		}
		System.out.println("Copies " + copies + " " + "Comparisons " + comparisons + " " + "Total = " + (copies+comparisons));
	}
}
