package chapter5_linkedlists_proprojects.project53;

public class CircularListApp {

	public static void main(String[] args) {
		CircularList theClist = new CircularList();
		theClist.insert(1);
		theClist.insert(2);
		theClist.insert(3);
		theClist.insert(4);
		theClist.insert(5);
		
		theClist.display();
		
		theClist.insert(6);
		theClist.insert(7);
		
		theClist.display();
		
		theClist.step();
		theClist.step();
		theClist.step();
		theClist.step();
		theClist.step();
		theClist.step();
		
		theClist.insert(8);
		theClist.remove();
		theClist.display();
	}

}
