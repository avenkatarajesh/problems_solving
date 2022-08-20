package firstAssignment;

import java.util.Scanner;

/*
 * Find if a String2 is substring of String1. If it is, return the index of the first
		occurrence. else return -1.
		Eg 1: Input: String 1: test123string
		          String 2: 123
		         Output: 4
		Eg 2:  Input: String 1: testing12
		         String 2: 1234
		         Output: -1
 */
public class Question_59 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String1 : ");
		String str1 = scan.next();
		int n = str1.length();
		System.out.println("Enter the String2 : ");
		String str2 = scan.next();
		int m = str2.length();
		int i=0 , j =0;
		aa:
		for( i = 0 ; i < n ; i++ ) {
			
			if(str1.charAt(i) == str2.charAt(0)) {
				for( j = 0 ; j < m ; j++) {
					if(i+j < n) {
						if(str2.charAt(j) == str1.charAt(i+j)) {
							continue;
						}else {
							System.out.println("-1");
							break aa;
						}
					}else {
						System.out.println(-1);
						break aa;
					}
				}
			}else {
				continue;
			}
			
			System.out.println("Index is "+ i);
		}
		
		
		
	}

}
