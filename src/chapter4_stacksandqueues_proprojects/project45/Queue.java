package chapter4_stacksandqueues_proprojects.project45;

//Queues are often used to simulate the flow of people, cars, airplanes
//transactions, and so on. Write a program that models checkout lines at
//a supermarket, using the Queue class from the queue.java program (Listing 4.4).
//Several lines of customers should be displayed; you can use the display() method of
//Programming Project 4.1. You can add a new customer by pressing a key. You'll
//need to determine how the customer will decide which line to join. The checkers
//will take random amounts of time to process each customer (presumably depending
//on how many groceries the customer has). Once checked out, the customer is removed
//removed from the line. For simplicity, you can simulate the passing of time by pressing a Key.
//Perhaps every keypress indicates the passage of one minute. (Java, of course, has more sophisticated
//ways to handle time.)

public class Queue {
private int maxSize;
private Customer[] queArray;
private int front;
private int rear;
private int nItems;

	public Queue(int s) {
		maxSize = s;
		queArray = new Customer[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void displayQueue() {
		if(isEmpty()) {
			System.out.print("Array Empty");
		}else if(nItems==1) {
			Customer cus = queArray[front];
			System.out.print(front + ":" + cus.getGroceries());
		}else {
			int current = front;
			if(rear == -1) {
				while(current < maxSize) {
					Customer cus = queArray[current];
					System.out.print(current + ":" + cus.getGroceries() + " ");
					current++;
				}
			}else {
				while(current != rear) {
					if(current == maxSize-1) {
						Customer cus = queArray[current];
						System.out.print(current + ":" + cus.getGroceries() + " ");
						current=0;
					}else {
						Customer cus = queArray[current];
						System.out.print(current + ":" + cus.getGroceries() + " ");
						current++;
					}				
				}
				Customer cus = queArray[current];
				System.out.print(current + ":" + cus.getGroceries() + " ");
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public void time() {
		if(nItems==0) {
			System.out.print("empty");
		}else {
			Customer temp = queArray[front];
			int gr = temp.getGroceries();
			if(gr==1) {
				remove();
			}else {
				queArray[front].decrementGroceries();
			}
		}
	}
	
	public void insert() {
		Customer cust = new Customer();
		if(rear == maxSize-1) {
			rear = -1;
		}
		queArray[++rear] = cust;
		nItems++;
	}
	
	public void remove() {
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
	}
	
	public Customer peekFront() {
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
