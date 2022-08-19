package firstAssignment;

import java.util.Arrays;

// Program to Find the Largest Number Among Three Numbers

public class Question_30 {

	public static void main(String[] args) {
		
		int arr[] = {1,10,100};
		
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
