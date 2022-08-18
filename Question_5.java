package firstAssignment;
/*
 *  input: E
	Output:
			EEEEE
			DDDD
			CCC
			BB
			A
 */
import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = scan.next().charAt(0);
		
		int n = (int)ch-65;
		
		
		for(int i = 0 ; i <= n ; i++) {
			int len = (int)ch-65;
			for(int j = 0 ; j <= len ; j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch--;
		}
		
	}

}
