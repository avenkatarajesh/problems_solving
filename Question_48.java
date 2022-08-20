package firstAssignment;
/*
	 * 	 	 9
	        898
	       78987
	      6789876
	     567898765
	    45678987654
	   3456789876543
	  234567898765432
	 12345678987654321
 */
import java.util.Scanner;

public class Question_48 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int print = n;
		for(int i = 1 ; i < n ; i++) {
			
			for(int j = i ; j < n; j++) {
				System.out.print(" ");
			}
			print--;
			for(int k = 1 ; k <= i ; k++ ) {
				System.out.print(print++);
			}
			--print;
			for(int k = 1 ; k < i ; k++ ) {
				System.out.print(--print);
			}
			System.out.println();
		}
	}

}
