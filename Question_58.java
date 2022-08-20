package firstAssignment;

/*
 * 	Write a program to print the following pattern for the given input number.
		Eg 1:  Input: 4
		        Output:
			********
			***__***
			**____**
			*______*
			**____**
			***__***
			********
 */
import java.util.Scanner;

public class Question_58 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n  = scan.nextInt();
		
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = i ; j < n ; j++ ) {
				System.out.print("*");
			}
			for(int j = 0 ; j < i ; j++ ) {
				System.out.print("_");
			}
			for(int j = 0 ; j < i  ; j++ ) {
				System.out.print("_");
			}
			for(int j = i ; j < n ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i = 1 ; i < n ; i++) {
				for(int j = 0 ; j <= i ; j++ ) {
					System.out.print("*");
				}
				for(int j = i ; j < n-1 ; j++) {
					System.out.print("_");
				}
				for(int j = i ; j < n-1 ; j++) {
					System.out.print("_");
				}
				for(int j = 0 ; j <= i ; j++) {
					System.out.print("*");
				}
			
			System.out.println();
		}
		
	}

}
