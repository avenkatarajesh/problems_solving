package firstAssignment;

/*
 * 20) Evaluate the following expression on paper and on program and understand the difference
	x = x++ * 2 + 3 * –x;
 */
public class Question_20 {

	public static void main(String[] args) {
		int x = 28;
		x = x++ * 2 + 3 * --x;// x  = 28 * 2 + 3 * 28 = 140
		
		System.out.println("X is " + x);
	}

}
