package firstAssignment;
/*
 * Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
	1111 +.. n terms.
	Eg 1: Input:  Input the number of terms : 5
	Output :
	1 + 11 + 111 + 1111 + 11111
	The Sum is : 12345
	Eg 2: Input:  Input the number of terms : 3
	Output :
	1 + 11 + 111
	The Sum is : 123
 */
import java.util.Scanner;

public class Question_60 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number of terms : ");
		int n = scan.nextInt();
		long sum = 0 ;
		int print = 1;
		for(int i = 0 ; i < n ; i++) {
			int count = 0;
			for(int j = 0 ; j <= i ; j++ ) {
				System.out.print(print);
				count++;
			}
			if(count<10) {
			sum *= 10;
			sum +=count;
			}else if(count > 9) {
				sum *= 100;
				sum +=count;
			}
			if(i != n-1) {
			System.out.print(" + ");
			}
		}
		System.out.println();
		System.out.println("This Sum is " +sum);
	}
}
