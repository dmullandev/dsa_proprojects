package chapter6_recursion_proprojects.project61;

//Suppose you buy a budget-priced pocket PC and discover that the chip inside can't do multiplication
//only addition. You program your way out of this quandary by writing a recursive method, mult(),
//that performs multiplication of x to itself y times. Its arguments are x and yand its return
//value is the product of x and y. Write such a method and a main() program to call it. Does the
//addition take place when the method calls itself or when it returns;

//calls itself

public class Goodchip {
	int result = 0;
	public Goodchip() {
		
	}
	
	public int mult(int x, int y) {
		if(y>=0) {
			result += x;
			y--;
			mult(x, y);
		}
		return result;
	}
}
