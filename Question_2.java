package firstAssignment;

import java.util.Scanner;

public class Question_2 {
	
	/*
	 * input : X
	 * Output : XYZ
	 * input : M
	 * Output : MNOPQRSTUWXYZ
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = scan.next().charAt(0);
		
		int n = (int)ch;
		
		for(int i = n ; i < 91 ; i++ ) {
			System.out.print(ch+" ");
			ch++;
		}
		
		
		

	}

}
