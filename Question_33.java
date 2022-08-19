package firstAssignment;
// Program to Check Whether a Character is an Alphabet or not

import java.util.Scanner;

public class Question_33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = scan.next().charAt(0);
		int val = (int)ch;
		
			if(val<65 || val>122) {
				System.out.println("Entered Character is not a  Alphabet ");
				return;
			}else if(val > 90 && val < 97) {
				System.out.println("Entered Character is not a  Alphabet ");
				return;
			}else {
				System.out.println("Entered Character is a Alphabet ");
			}
			
			
	}

}
