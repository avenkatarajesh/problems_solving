package firstAssignment;
// Program to Demonstrate the Working of Keyword long
public class Question_26 {
	public static void main(String[] args) {
		
		// long - store large range of a number -2^63 to 2^63-1
		// long - 8 byte 
		// long - 0L default value
		
		
		long val1 = 123454L;
		long val2 = -12345L;
		
		System.out.println("value : "+val1);
		System.out.println("value : "+val2);
		
		// long val3 = 3.14;
		// Incompatible types: possible lossy conversion from double and float to long
		
		long val4 = 'a';
		// long allow implicit type cast char to long type
		System.out.println(val4);
		
		
		long min = Long.MIN_VALUE;
		long max = Long.MAX_VALUE;
		
		System.out.println("Minimum value of long : "+ min);
		System.out.println("Maximum value of long : "+ max);
		
		
		
		
		
				
				
		
	}

}
