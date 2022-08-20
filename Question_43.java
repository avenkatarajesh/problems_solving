package firstAssignment;
// Java Program to left rotate the elements of an array
public class Question_43 {

	public static void main(String[] args) {
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
		
		
	}

}
