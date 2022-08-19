package firstAssignment;

//if int y = 10 then find int z = (++y * (y++ + 5));
public class Question_21 {

	public static void main(String[] args) {
		
		int y = 10 ; 
		int z = (++y * (y++ + 5 ));// ++y = 11 * (11 + 5) = 176 ,y = 12
		
		System.out.println("Z is " + z);
		System.out.println("y is " + y);

	}

}
