package firstAssignment;

import java.util.Random;

// Java Program to print the number of elements present in an array
public class Question_40 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[20];
		
		for(int i= 0; i < arr.length ; i++) {
			arr[i] = ran.nextInt(50); // allocates random values to the array 
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}

}
