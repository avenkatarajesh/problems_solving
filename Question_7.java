package firstAssignment;

import java.util.Scanner;

/*
 *  Input: 12345
        Output:
		1       1
  		  2   2
    		3
  		  4   4
		5       5
 */

public class Question_7 {

	public static void main(String[] args) {
	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter the input(odd lenght) : ");
	
	String str= scan.next();
	
	for(int i = 0 ; i < str.length() ; i++) {
		for(int j = 0 ; j < str.length() ; j++) {
			
			if(j == i || j == str.length()-i-1) {
				System.out.print(str.charAt(i));
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	
		

	}

}
