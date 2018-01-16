package chapter4_stacksandqueues_proprojects.project41;

//Write a method for the Queue class in the queue.java program (Listing 4.4) that
//displays the contents of the queue. Note that this does not mean simply
//displaying the contents of the underlying array. You should show the queue.
//contents from the first item inserted to the last, without indicating to the
//viewer whether the sequence is broken by wrapping around the end of the
//array. Be careful that one item and no items display properly, no matter where
//front and rear are.

public class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void displayQueue() {
		if(isEmpty()) {
			System.out.print("Array Empty");
		}else if(nItems==1) {
			System.out.print(queArray[front]);
		}else {
			int current = front;
			if(rear == -1) {
				while(current < maxSize) {
					System.out.print(queArray[current] + " ");
					current++;
				}
			}else {
				while(current != rear) {
					if(current == maxSize-1) {
						System.out.print(queArray[current] + " ");
						current=0;
					}else {
						System.out.print(queArray[current] + " ");
						current++;
					}				
				}
				System.out.print(queArray[current]);
			}
		}
	}
	
	public void insert(long j) {
		if(rear==maxSize-1) {
			rear = -1;
		}
		queArray[++rear] = j;
		nItems++;
	}
	
	public long remove() {
		long temp = queArray[front++];
		if(front==maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems==0);
	}
	
	public boolean isFull() {
		return (nItems==maxSize);
	}
	
	public int size() {
		return nItems;
	}
}
