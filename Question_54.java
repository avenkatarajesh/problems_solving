package firstAssignment;

import java.util.Scanner;

/*
	Write a program to sort the elements in odd positions in descending order and
	elements in ascending order.
	Eg 1:  Input:  13,2,4,15,12,10,5
	         Output: 13,2,12,10,5,15,4
	Eg 2:  Input: 1,2,3,4,5,6,7,8,9
	         Output: 9,2,7,4,5,6,3,8,1
 */
public class Question_54 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print(" Enter the length of an array : " );
		int n =scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0 ; i < n ; i++)
		{
			arr[i] = scan.nextInt();
		}
		int[] odd = new int[n];
		
		for(int i = 0 ; i < n ; i++) 
		{	
			if(i%2 == 0 ) {
				odd[i] = arr[i];
			}
		}
		
		for(int i = 0 ; i < odd.length ; i++) {// sorting 
			for(int j = i+1 ; j < odd.length ; j++) {
				if(odd[i] < odd[j]) {
					int temp = odd[i];
					odd[i] = odd[j];
					odd[j] = temp;
				}
			}
		}
		int j = 0 ;
		for(int i = 0 ; i < n ; i++) 
		{
			if(i%2 == 0 ) {
				arr[i] = odd[j++];
			}
		}
		
		
		for(int i : arr) {
			System.out.print(i +" ");
		}

	}

}
