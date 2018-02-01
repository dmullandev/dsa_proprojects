package chapter5_linkedlists_proprojects.project54;

public class CircularListApp {

	public static void main(String[] args) {	
		Stack st = new Stack();
		int searchKey = 5;
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
//		System.out.println(st.pop().value);
		
		if (st.search(searchKey)) {
			System.out.println("Found " + searchKey);
		}else {
			System.out.println("Not Found " + searchKey);
		}
	}
}
