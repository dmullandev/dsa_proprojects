package chapter5_linkedlists_proprojects.project56;

//Let's try something a little different: a two-dimensional linked list, which we'll
//call a matrix. This is the list analogue of a two-dimensional array. It might be
//useful in applications such as spreadsheet programs. If a spreadsheet is based
//on an array, and you insert a new row near the top, you must move every cell 
//in the lower rows N*M cells, which is potentially a slow process. If the spread-sheet
//is implemented by a matrix, you need only change N pointers.

//For simplicity, we'll assume a singly linked approach (although a double-linked approach
//would probably be more appropriate for a spreadsheet). Each link (except those on the top
//row and left side) is pointed to by the link directly above it and by the link on its left.
//You can start at the upper-left link and navigate to, say, the link on the third row and fifth
//column by following the pointers down two rows and right four columns. Assume your matrix
//is created with with specified dimensions (7 by 10, for example). You should be able to insert
//values in specific links and display the contents of the matrix.

public class LinkedListMatrix {
	
}
