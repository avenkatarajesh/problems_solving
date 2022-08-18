package firstAssignment;
//Write a program to find the area of the cylinder

import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the heigth : ");
		int heigth = scan.nextInt();
		System.out.println("Enter the radius : ");
		int radius = scan.nextInt();
		
		// area of Cylinder is 2πrh+2πr^2
		double pi = 3.14;
		double areaOfCylinder = (2*pi*heigth*radius) + (2*pi*radius*radius);
		
		System.out.println(areaOfCylinder);
		
		

	}

}
