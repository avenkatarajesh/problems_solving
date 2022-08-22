package firstAssignment;

import java.util.Scanner;
import java.util.Stack;

/*Using Recursion reverse the string such as
	Eg 1:  Input: one two three
	       Output: three two one
	Eg 2:  Input: I love india
	       Output: india love I
 */
public class Question_52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int n = scan.nextInt();
		String[] str = new String[n];
		
		for(int i = 0 ; i < n ; i++) {
			str[i] = scan.next();
		}
		int start = 0;
		int end = n-1;
		reverseString(str,start,end);
		for(String i : str) {
			System.out.print( i +" ");
		}
		
	}
	
	static public void reverseString(String[] s , int sta , int e)	{
		
		if(sta >= e) {
			return;
		}else {
			String temp = s[sta];
			s[sta] =s[e];
			s[e] = temp;
		}
		
	}


}
