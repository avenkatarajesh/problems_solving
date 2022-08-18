package firstAssignment;

public class Question_4 {

	public static void main(String[] args) {
		
		int num1 = 10 ;
		int num2 = 12;
		
		//Bitwise And 
		// num1 & num2 = 1010 & 1100 = 1100(8)
		int ans = num1&num2;
		System.out.println(num1 + " & " + num2 + " = " + ans);
		
		//Bitwise OR 
		// num1 | num2 = 1010 | 1100 = 1110(14)
		ans = num1|num2;
		System.out.println(num1 + " | " + num2 + " = " + ans);
		
		//Bitwise XOR 
		// num1 ^ num2 = 1010 ^ 1100 = 110(6)
		ans = num1^num2;
		System.out.println(num1 + " ^ " + num2 + " = " + ans);
		
		//Bitwise not 
		// ~num1(00000000 00000000 00000000 00001010 = 11111111 11111111 111111111 11110101 (-11)
		ans = ~num1;
		System.out.println(" ~ " + num1 + " = " + ans);
	}
}
