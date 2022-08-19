package firstAssignment;

import java.util.Scanner;

// Write a program to evaluate the polynomial equation
public class Question_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a : ");
		double a = scan.nextInt();
		
		System.out.println("Enter b : ");
		double b = scan.nextInt();
		
		System.out.println("Enter c : ");
		double c = scan.nextInt();
		
		
		double root1=0;
		double root2=0;
		double r = Math.abs((b * b )- (4 * a * c));
		double numeratorPart = Math.sqrt(r);
		double numerator1 =  -b + numeratorPart;
		double numerator2 =  -b - numeratorPart;
		
		double denominator = 2*a;
		
		root1 = numerator1/denominator;
		root2 = numerator2/denominator;
		
		
		System.out.println(root1);
		System.out.println(root2);
		
		
		

	}

}
