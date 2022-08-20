package firstAssignment;
//Program to Find Factorial of a Number and the factorial number's sum of digits.

import java.util.Scanner;

public class Question_35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = scan.nextInt();
		
		int factorial = 1;
		
		for(int i =1 ; i <= n; i++) {
			
			factorial *= i;
		}
		int sum = 0 ;
		
		while(factorial > 0) {
			sum += factorial % 10;
			factorial /= 10;
		}
		
		System.out.println(sum);
			

	}

}
