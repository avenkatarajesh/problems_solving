package firstAssignment;
// Program to Check Whether a Number is Positive or Negative
import java.util.Scanner;

public class Question_32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int num = scan.nextInt();
		
		if(num == 0 ) {
			System.out.println("neither positive nor negative.");
		}else if(num<0) {
			System.out.println("Negative number");
		}else
			System.out.println("Positive number");
	}

}
