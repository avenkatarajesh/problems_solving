package firstAssignment;

// x = 5
//x1 = ++x – x++ + --x

public class Question_23 {

	public static void main(String[] args) {
		
		int x = 5 ;
		
		int x1 = ++x - x++ + --x; // x1 = 6 - 6 + 6
		
		System.out.println("X1 is " + x1);
		System.out.println("X is " + x);
	}	

}
