package firstAssignment;

import java.util.Scanner;

//Program to Calculate the Sum of Natural Numbers and find the largest digit of the sum.
public class Question_34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int n = scan.nextInt();
		int sum =0;
		sum = recursion(n , sum ,1);
		System.out.println("This is sum :"+sum);
		int largeDigit = sum%10;
		while(sum > 0) {
			if(sum%10 > largeDigit) {
				largeDigit = sum%10;
			}
			
			sum/=10;
		}
		System.out.println("Largest digit is : "+largeDigit);
	}
	static public int recursion(int n , int s, int start){
		if(start > n ) {
			return s;
		}
			s+=start++;
		return	recursion(n, s, start);
	}
		
}
