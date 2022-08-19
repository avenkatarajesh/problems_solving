package firstAssignment;

/*
 * 18) Evaluate the following expression on paper and on program and understand the difference
	i) ++a-b–     ii) a%b++     iii)  a*=b+5        iv) x=69>>>2
	
	 

 * 
 */
public class Question_18 {

	public static void main(String[] args) {
		
		int a = 5 ; 
		int b = 3 ;
		System.out.println("a = "+a +"  b = "+ b );
		int c = ++a-b--;
		System.out.println("a = "+a +"  b = "+ b+"  c = "+c);
		System.out.println();
		
		a = 5;
		b = 3;
		System.out.println("a = "+a +"  b = "+ b );
		c= a%b++;
		System.out.println("a = "+a +"  b = "+ b+"  c = "+c);
		System.out.println();
		
		a = 5;
		b = 3;
		System.out.println("a = "+a +"  b = "+ b );
		a*=b+5;
		System.out.println("a = "+a +"  b = "+ b);
		System.out.println();
		
		int x = 69>>>2; // right swift operator 
		System.out.println(x);
		
		

	}

}
