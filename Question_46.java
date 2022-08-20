package firstAssignment;
// java Program to rotate the elements of an array in the right direction

public class Question_46 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int temp = arr[arr.length-1];
		int i = 0;
		
		for( i = arr.length-1 ; i > 0 ; i--) {
			arr[i] = arr[i-1];
		}
		
		if(i == 0) {
			arr[i] = temp;
		}
		for(int j : arr) {
			System.out.print(j +" ");
		}
	}

}
