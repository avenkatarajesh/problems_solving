package firstAssignment;
/*
 * 	99999999999999999
	 888888888888888
	  7777777777777
	   66666666666
	    555555555
	     4444444
	      33333
	       222
	        1
 */
import java.util.Scanner;

public class Question_50 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int print = n-1;
		for(int i = 1 ; i < n ; i++) {
			for(int j = 1 ; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = i ; k < n ; k++ ) {
				System.out.print(print);
			}
			for(int k = i ; k < n-1 ; k++ ) {
				System.out.print(print);
			}
			System.out.println();
			print--;
		}
		
	}
}
