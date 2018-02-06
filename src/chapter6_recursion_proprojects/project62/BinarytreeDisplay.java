package chapter6_recursion_proprojects.project62;

//In Chapter 8, “Binary Trees,” we’ll look at binary trees, where every branch has
//(potentially) exactly two sub-branches. If we draw a binary tree on the screen
//using characters, we might have 1 branch on the top row, 2 on the next row,
//then 4, 8, 16, and so on. Here’s what that looks like for a tree 16 characters
//wide:
//--------X-------
//----X-------X---
//--X---X---X---X-
//-X-X-X-X-X-X-X-X
//XXXXXXXXXXXXXXXX
//312 CHAPTER 6 Recursion
//(Note that the bottom line should be shifted a half character-width right, but
//there’s nothing we can do about that with character-mode graphics.) You can
//draw this tree using a recursive makeBranches() method with arguments left
//and right, which are the endpoints of a horizontal range. When you first enter
//the routine, left is 0 and right is the number of characters (including dashes)
//in all the lines, minus 1. You draw an X in the center of this range. Then the
//method calls itself twice: once for the left half of the range and once for the
//right half. Return when the range gets too small. You will probably want to put
//all the dashes and Xs into an array and display the array all at once, perhaps
//with a display() method. Write a main() program to draw the tree by calling
//makeBranches() and display(). Allow main() to determine the line length of the
//display (32, 64, or whatever). Ensure that the array that holds the characters for
//display is no larger than it needs to be. What is the relationship of the number
//of lines (five in the picture here) to the line width?

public class BinarytreeDisplay {
	public static String[] tree;
	public BinarytreeDisplay(int s) {
		int numRows = (int)(Math.log(s)/Math.log(2)) + 1;
		tree = new String[numRows];
		for(int i=0; i<tree.length;i++) {
			tree[i] = " ";
		}
		makeBranches(0,s-1, 0);
		display(tree);
	}
	
	public static void makeBranches(int left, int right, int row) {
		if(left-right==0) {
			return;
		}
		int mid = (left+right) /2 ;
		for(int i=left; i<right; i++) {
			if(i == mid) {
				tree[row] += "X";
			}else {
				tree[row] += "-";
			}
		}
		makeBranches(left,mid,row+1);
		
		makeBranches(mid+1,right,row+1);
		
	}
	
	public void display(String[] tree) {
		for(int i = 0; i < tree.length; i++)
		{
			System.out.println(tree[i]);
		}
	}
}
