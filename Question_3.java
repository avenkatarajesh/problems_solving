package firstAssignment;
/*
 * Input : 12345
 * Output : 12345 - 54321 = -41976
 * Input : 543
 * Output : 543 - 345 = 198
 */

import java.util.Scanner;

public class Question_3 {

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
		System.out.println(input - reverseInput);
	}

}
