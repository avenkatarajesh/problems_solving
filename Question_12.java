package firstAssignment;

import java.util.Scanner;

// Write a program to print the number 7.50 without using String.

public class Question_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value : ");
		
		float f = scan.nextFloat();
		
		System.out.printf("%.2f",f);//using printf to specify decimal points to print

	}

}
