package firstAssignment;
// Java Program to copy all elements of one array into another array

public class Question_41 {

	public static void main(String[] args) {
		
		int[] arr = {1,5,7,9,8,10,55,45};
		
		int[] arrcpy = arr; // directly initiated 
		
		int[] arrcpy1 = arr.clone(); // using in-build methods
		
		for(int i : arrcpy) {
			System.out.println(i);
		}
		
		for(int i : arrcpy1) {
			System.out.println(i);
		}
		
	}

}
