package chapter5_linkedlists_proprojects.project56;

public class LinkedListMatrixApp {

	public static void main(String[] args) {
		LinkedListMatrix matrix = new LinkedListMatrix(7, 10);
		
		matrix.insert(0, 9, 1);
		matrix.insert(0, 0, 1);
		matrix.insert(6, 9, 1);
		matrix.insert(6, 0, 1);
		
		
		matrix.insert(3, 2, 44);
		matrix.insert(3, 3, 55);
		matrix.insert(3, 4, 66);
		matrix.insert(3, 5, 77);
		matrix.insert(3, 6, 88);
		matrix.display();
		
		//output=
//		  1 |null|null|null|null|null|null|null|null| 1 |
//		 null|null|null|null|null|null|null|null|null|null|
//		 null|null|null|null|null|null|null|null|null|null|
//		 null|null| 44 | 55 | 66 | 77 | 88 |null|null|null|
//		 null|null|null|null|null|null|null|null|null|null|
//		 null|null|null|null|null|null|null|null|null|null|
//		  1 |null|null|null|null|null|null|null|null| 1 |
	}
}
