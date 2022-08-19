package firstAssignment;
// Program to Swap Two Numbers
public class Question_27 {

	public static void main(String[] args) {
		int a = 9;
		int b = 6;
		
		System.out.println("before swapping  a : "+a+" b : " +b);
		
		System.out.println("Using extra variable");
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping  a : "+ a +" b :"+ b);
		System.out.println();
		
		System.out.println("using extra space ");
		
		a = 9;
		b = 6;
		System.out.println("before swapping  a :"+a+" b : " +b);
		
		a = a+b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping  a : "+ a +" b :"+ b);
		System.out.println();
		
		
		System.out.println("without wasting space ");
		a = 9;
		b = 6;
		System.out.println("before swapping  a :"+a+" b : " +b);
		
		b = a+b - (a=b);
		System.out.println("After Swapping  a : "+ a +" b :"+ b);
		
		
	}

}
