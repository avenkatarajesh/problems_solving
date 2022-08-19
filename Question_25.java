package firstAssignment;
//Program to Compute Quotient and Remainder

import java.util.Scanner;

public class Question_25 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Divident : ");
		int divident = scan.nextInt();
		
		System.out.println("Enter the Divisor : ");
		int divisor = scan.nextInt();
		
		
		double quotient = divident / divisor;
		int remainder = divident % divisor ;
		
		System.out.printf("This is Quotient = %.2f \n",quotient);
		System.out.println("This is Remainder : "+remainder);
	}
	
}
