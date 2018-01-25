package chapter4_stacksandqueues_proprojects.project45;

import java.util.Scanner;
public class QueueApp {

	public static void main(String[] args) {
		
		Queue q1 = new Queue(5);
		Queue q2 = new Queue(5);
		Queue q3 = new Queue(5);
		
		boolean quit = false;
		System.out.println("Commands = 'one, two, three, display, quit, time' ");
		while(!quit) {
			Scanner sc = new Scanner(System.in);
			String in = sc.nextLine();
			switch(in) {
				case "one": 
						q1.insert();
						q1.displayQueue();
						break;
				case "two": 
						q2.insert();
						q2.displayQueue();
						break;
				case "three": 
						q3.insert();
						q3.displayQueue();
						break;
				case "display":
						q1.displayQueue();
						q2.displayQueue();
						q3.displayQueue();
						break;
				case "time":
						q1.time();
						q2.time();
						q3.time();
						break;
				case "quit": 
						sc.close();
						quit = true;
						break;							
			}
		}
	}

}