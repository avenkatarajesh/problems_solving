package firstAssignment;
/*
 *  Evaluate the following expression on paper and on program and understand the difference
		a+=a++ + ++a + –a + a–; when a=28
 */
public class Question_19 {
	public static void main(String[] args) {
		
		int a =28;
		System.out.println("before operation  " + a);
		a += a++ + ++a + --a + a-- ;// 28 += 28 + 30 + 29 + 29
		System.out.println("after operation  "+a);
	}
}
