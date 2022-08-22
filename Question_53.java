package firstAssignment;

import java.util.Scanner;

/*
 * Write a program to give the following output for the given input:
	Eg 1:  Input: a1b10
	Output: abbbbbbbbbb
	Eg: 2:  Input: b3c6d15
    Output: bbbccccccddddddddddddddd
	The number varies from 1 to 99.
 */
public class Question_53 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.next();
		
		int n = str.length();
		
		char ch = '\0';
		
		for(int i = 0 ; i < n ; i++) {
			ch = str.charAt(i);
			int len = 0 ;
			int j = i+1 ;
			
			while(j < n && str.charAt(j) < 'A') {
				len*=10;
				len += str.charAt(j)-'0';
				j++;
			}
			i = j-1;
			for(int k = 0 ; k < len ; k++) {
				System.out.print(ch+" ");
			}
			
		}
		
	}

}
