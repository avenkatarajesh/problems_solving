package firstAssignment;
// Program to Check Whether a Number is Even or Odd
import java.util.Scanner;

public class Question_28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Entered number is even ");
		}else
			System.out.println("Entered number is odd");
		
		

	}

}
