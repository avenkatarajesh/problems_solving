package firstAssignment;

import java.util.Scanner;

// Given the radius of two concentric circle, find the area of the space between the circles
public class Question_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Radius of circle 1  : ");
		int  radius1 = scan.nextInt();
		
		System.out.println("Enter Radius of circle 2  : ");
		int  radius2 = scan.nextInt();
		
		double areaOfCircle1 = Math.PI * radius1*radius1;
		double areaOfCircle2 = Math.PI * radius2*radius2;
		
		double spaceBtwCircles = Math.abs(areaOfCircle1-areaOfCircle2);
		
		System.out.println(spaceBtwCircles);
		
	}

}
