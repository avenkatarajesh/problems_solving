package firstAssignment;
/*
 * 10
Multiplication Table      Subtraction Table 
     10x1 = 10                 10-1 = 9
     10x2 = 20                 10-2 = 8
     10x3 = 30                 10-3 = 7
     10x4 = 40                 10-4 = 6
     10x5 = 50                 10-5 = 5
     10x6 = 60                 10-6 = 4
     10x7 = 70                 10-7 = 3
     10x8 = 80                 10-8 = 2
     10x9 = 90                 10-9 = 1
     10x10 = 100               10-10 = 0

 */
import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n = scan.nextInt();
	
	System.out.println("Multiplication Table      Subtraction Table ");
	for(int i = 1 ; i <= n ; i++) {
		int multi = n * i;
		int sub = n-i;
		
		System.out.println("     "+n +"x" + i + " = " + multi + "                 "+ n + "-" + i +" = "+sub);
	}
	}

}
