package firstAssignment;
// Write a program to find the area of the square

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int size = scan.nextInt();
		
		//area of square is length X breath
		System.out.println(size*size); 
	}
}
