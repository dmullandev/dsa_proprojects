package chapter4_stacksandqueues_proprojects.project42;

//Create a dequeue class based on the discussion of dequeues (double-ended queues) in this chapter.
//It should include insertLeft(), insertRight(), removeLeft(), removeRight(), isEmpty(), and isFull()
//methods. It will need to support wrap-around at the end of the array, as queues do.

public class Dequeue {
	int maxSize;
	long[] dequeArr;
	int front;
	int rear;
	int nItems;
	
	public Dequeue(int m) {
		maxSize = m;
		dequeArr = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;		
	}
	
	public int size() {
		return nItems;
	}
	
	public boolean isEmpty() {
		if(nItems==0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(nItems==maxSize) {
			return true;
		}
		return false;
	}
	
	public long peekFront() {
		return dequeArr[front];
	}
	
	public long peekRear() {
		return dequeArr[rear];
	}
	
	public void insertLeft(int value) {
		if(nItems==maxSize) {//full
			System.out.println("Array is full");
		}else if(front==0) {//wrap around
			if(rear==-1) {//start of array
				rear=0;
			}
			dequeArr[maxSize-1] = value;
			front = maxSize-1;
			nItems++;
		}else {//insert
			dequeArr[--front] = value;
			nItems++;
		}
	}
	public void insertRight(int value) {
		if(rear==maxSize-1) {
			rear=-1;
		}
		dequeArr[++rear] = value;
		nItems++;
	}
	
//	public long removeLeft() {return 1;}
//	public long removeRight() {return 1;}
	
}
