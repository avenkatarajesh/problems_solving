package firstAssignment;

import java.util.Random;

// Java Program to print the largest element in an array
public class Question_38 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[20];
		
		for(int i= 0; i < arr.length ; i++) {
			arr[i] = ran.nextInt(50); // allocates random values to the array 
		}
		
		int largest = arr[0];
		/*
		 * sorting array and then end element is largest in non decreasing order
		Arrays.sort(arr);
		largest = arr[arr.length-1];
		*/
		for(int i : arr) {
			if(largest<i) {
				largest = i;
			}
		}
		
		System.out.println(largest);
	}

}
