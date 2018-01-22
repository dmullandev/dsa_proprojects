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
	
	public boolean insertLeft(int value) {
		if(nItems==0) {
			dequeArr[front] = value;
			rear=front;
			++nItems;
			return true;
		}else if(front == 0 && nItems > 0){
			front=maxSize-1;
			dequeArr[front]= value;
			++nItems;
			return true;			
		}else if(front > 0){
			dequeArr[--front] = value;
			++nItems;
			return true;
		}		
		return false;
	}
	public boolean insertRight(int value) {
		if(rear==maxSize-1) {
			rear=-1;
			dequeArr[++rear] = value;
			++nItems;
			return true;
		}else if(rear==-1){
			dequeArr[++rear] = value;
			++nItems;
			return true;
		}
		if(nItems>0) {
			dequeArr[++rear] = value;
			++nItems;
			return true;
		}
		return false;
	}
	
	public long removeLeft() {
		if(isEmpty()) {
			return -1;
		}
		
		if(front == maxSize-1) {
			long temp = dequeArr[front];
			dequeArr[front] = 0;
			front = 0;
			--nItems;
			return temp;
		}
		long temp = dequeArr[front++];
		dequeArr[front-1] = 0;
		--nItems;
		return temp;		
	}
	public long removeRight() {
		if(isEmpty()) {
			return -1;
		}
		
		if(rear == 0 && nItems > 0) {
			long temp = dequeArr[rear];
			dequeArr[rear] = 0;
			rear = maxSize-1;
			--nItems;
			return temp;
		}
		long temp = dequeArr[rear--];
		--nItems;
		return temp;	
	}
	
}
