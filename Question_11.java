package firstAssignment;
// Java Program to left rotate the elements of a multidimensional array.
public class Question_11 {
	
	public static void main(String[] args) {
		
		
		System.out.println("one - Dimensional ");
		int[] arr = {1,2,3,4,5};
		int temp = arr[0];
		int i = 0;
		for( i = 0 ; i < arr.length-1 ; i++) {
			arr[i] = arr[i+1];
		}
		
		if(i == arr.length-1) {
			arr[i] = temp;
		}
		
		for(int j : arr) {
			System.out.print(j +" ");
		}
		
		System.out.println();
		System.out.println("two - Dimensional");
		
		for(int l = 0 ; l < 5  ; l++) {
			for(int m = 0 ; m < 5 ; m++) {
					System.out.print((l+m)%5+1);
				}
			System.out.println();
		}
		
		
	}

}
