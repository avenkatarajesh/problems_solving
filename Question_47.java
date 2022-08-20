package firstAssignment;

import java.util.Scanner;

/*
 * 
 */
public class Question_47 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		
		
		for(int i = 1 ; i <= n ; i++) {
			for(int k = 0 ; k < n-i/2 ; k++){
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print((i+j)%i + 1);
			}
			System.out.println();
		}

	}

}
