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
	int column;
	int row;
	Node first;
	Node current;
	
	public LinkedListMatrix(int row, int col) {
		column = col;
		this.row = row;
		
		first = new Node(0);
		current = first;
		
		Node temp;
		
		for(int i=0; i<row;i++) {
			temp = current;
			for(int j=1;j<column;j++) {
				temp.next = new Node(0);
				temp = temp.next;
			}
			if(i<row-1) {
				current.down = new Node(0);
				current = current.down;
			}
		}
	}
	

	public boolean insert(int r, int c, int value) {
		current = first;
		if(r > row || c > column || r < 0 || c < 0 || value <=0) {
			System.out.println("You have entered entered matrix values which are out of bounds or a value not greater than 0");
			return false;
		}else {
			for(int i=0; i<r;i++) {
				current = current.down;
			}
			for(int j=1; j<=c; j++) {
				current = current.next;
			}
			current.insert(value);
			return true;
		}
	}
	
	public void display() {
		Node temp;
		int x = 0;
		int y = 0;
		int v;
		current = first;
		while(y < row) {
			x=0;
			temp = current;
			while(x < column) {
				v = temp.getValue();
				if(v>0) {
					System.out.print(" " + v + "" + " |");
				}else {
					System.out.print("null" + "|");
				}
				++x;
				temp = temp.next;
			}
			current = current.down;
			++y;
			System.out.println();
		}
	}
}
