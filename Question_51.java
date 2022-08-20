package firstAssignment;

import java.util.Scanner;

/*Write a program to display the number in reverse order without use of String functions
 	Input: 12345
	Output :The number in reverse order is : 54321 
 */
public class Question_51 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input : ");
		int input = scan.nextInt();
		int inputCpy = input;
		int reverseInput = 0 ; 
		
		while(inputCpy>0) {
			int temp = inputCpy%10;
			reverseInput = reverseInput*10 + temp;
			inputCpy /= 10;
		}
		System.out.println("Reverse order : "+reverseInput);
	}
}
