package firstAssignment;

import java.util.Scanner;

// Program to Check Whether a Character is a Vowel or Consonant
// vowel - A E I O U || a e i o u

public class Question_29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = scan.next().charAt(0);
		int val = (int)ch;
		
			if(val<65 || val>122) {
				System.out.println("Entered Character is not a  Alphabet letter ");
				return;
			}
			if(val > 90 && val < 97) {
				System.out.println("Entered Character is not a  Alphabet letter ");
				return;
			}
		
		boolean isVowel = false;
		
		switch(ch) {
		case 'a' : 
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : isVowel = true;
		}
		
		if(isVowel) 
			System.out.println("Entered Character is Vowel");
		else
			System.out.println("Entered Character is Consonant");
		
	}
}
