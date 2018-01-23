package chapter4_stacksandqueues_proprojects.project44;

//The priority queue shown in Listing 4.6 features fast removal of the
//high-priority item but slow insertion of new items. Write a program
//with a revised PriorityQ class that has fast O(1) insertion time but slower removal
//of the high-priority item. Include a method that displays the contents of the priority
//queue, as suggested in Programming Project 4.1

public class PriorityQ {
private int maxSize;
private long[] queArray;
private int nItems;
	
	public PriorityQ(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	public void insert(long item) {
		queArray[nItems++] = item;
	}
	
	public void displayPriorityQ() {
		while(!isEmpty()) {
			System.out.print(remove() + " ");
		}
	}
	
	public long remove() {
		if(isEmpty()) {
			return -1;
		}
		long temp = 0;
		int k=0;
		for(int i=0;i<maxSize;i++) {
			if(temp < queArray[i]) {
				k = i;
				temp = queArray[i];
			}
		}
		queArray[k] = 0;
		nItems--;
		return temp;
	}
	
	public long peekMin() {
		return queArray[nItems-1];
	}
	
	public boolean isEmpty() {
		return (nItems==0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
}
