package firstAssignment;

import java.util.Scanner;

/*
 *  Write a program to make such a pattern like a pyramid with numbers increased by 1.
	Eg:  Input : 10
	Output:
	     1
	    2 3
	   4 5 6
	  7 8 9 10
 */
public class Question_56 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		
		int print =1;
		for(int i = 1 ; print<n ; i++) {
			for(int k = 0 ; k < n-i/2 ; k++){
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(print+" ");
				print++;
			}
			System.out.println();
		}
		
		
	}

}
