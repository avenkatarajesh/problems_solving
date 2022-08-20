package firstAssignment;

import java.util.Scanner;

/*
 * Write a program to print the following output for the given input. You can assume
	the string is of odd length
	Eg 1:  Input: 12345
	        Output:
	1       5
	  2   4
	    3
	  2   4
	1       5
 */
public class Question_57 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the input(odd lenght) : ");
		
		String str= scan.next();
		
		for(int i = 0 ; i < str.length() ; i++) {
			for(int j = 0 ; j < str.length() ; j++) {
				
				if(j == i) {
					System.out.print(str.charAt(j));
				}else if(j == str.length()-i-1){
						System.out.print(str.charAt(j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
