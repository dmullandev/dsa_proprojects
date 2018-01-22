package chapter4_stacksandqueues_proprojects.project43;

public class StackApp {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
