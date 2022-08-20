package firstAssignment;

import java.util.Random;

//Java Program to print the smallest element in an array
public class Question_39 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[20];
		
		for(int i= 0; i < arr.length ; i++) {
			arr[i] = ran.nextInt(50); // allocates random values to the array 
		}
		
		int smallest = arr[0];
		/*
		 * sorting array and first element is smallest in non decreasing order
		Arrays.sort(arr);
		largest = arr[0];
		*/
		for(int i : arr) {
			if(smallest > i) {
				smallest = i;
			}
		}
		
		System.out.println(smallest);
	}

}
