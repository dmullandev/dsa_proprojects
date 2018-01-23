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
		int j;
		
		if(nItems==0) {
			queArray[nItems++] = item;
		}else {
			for(j=nItems-1;j>=0;j--) {
				if(item > queArray[j]) {
					queArray[j+1] = queArray[j];
				}else {
					break;
				}
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	
	public long remove() {
		return queArray[--nItems];
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
