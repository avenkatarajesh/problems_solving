package firstAssignment;
// Java Program to print the elements of an array present on even position
public class Question_36 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0 ; i < arr.length ; i= i+2) {// starting 0th position
			if(i%2 == 0)
				System.out.println(arr[i]);
		}

	}

}
