package firstAssignment;
/*
 * Write a program to print the alphabet 'C' with the stars based on the given numbers
	Eg 1:  Input: 4
	        Output:
	****
	*
	*
	***
 */
import java.util.Scanner;

public class Question_55 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input : ");
		int input = scan.nextInt();
		
		
		for(int i = 0 ; i < input ; i = i+3) {
			for(int j = i ; j < input ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < input ; i = i+3) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
