package firstAssignment;
// Java Program to print the sum of all the items of the array
import java.util.Random;

public class Question_45 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[20];
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = ran.nextInt(50);// random number is allocated using Random class
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
		
		

	}

}
