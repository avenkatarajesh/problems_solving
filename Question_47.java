package firstAssignment;

import java.util.Scanner;

	/*	     1
	        121
	       12321
	      1234321
	     123454321
	    12345654321
	   1234567654321
	  123456787654321
	 12345678987654321
 */
public class Question_47 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		
		for(int i = 1 ; i < n ; i++) {
			int print = 1;
			for(int j = i ; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ; k++ ) {
				System.out.print(print++);
			}
			--print;
			for(int k = 1 ; k < i ; k++ ) {
				--print;
				System.out.print(print);
			}
			System.out.println();
		}
	}

}
