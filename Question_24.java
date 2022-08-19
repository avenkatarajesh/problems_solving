package firstAssignment;

import java.util.Scanner;

// Program to Find ASCII Value of a Character
public class Question_24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = scan.next().charAt(0);
		
		int Ascii = (int)ch;
		
		System.out.println("ASCII Value of "+ch + " is : "+ Ascii);
		
	}

}
