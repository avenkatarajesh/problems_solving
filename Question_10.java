package firstAssignment;

/*
 * Input : {1, 2, 3, 4, 5, 6, 7}
 * Output: {7, 1, 6, 2, 5, 3, 4}
 */
public class Question_10 {

	public static void main(String[] args) {
		
		int[] input = {1, 2, 3, 4, 5, 6, 7};
		int n = input.length;
		int[] result = new int [n];
		
		int i = 0,j=0;
		while(i<n-1) {
				result[i++] = input[n-j-1];
				result[i++] = input[j];
				j++;
		}
		
		if(n%2 != 0 ) {
			result[n-1] = input[n/2];
		}
		
		for(int k : result) {
			System.out.print(k);
		}
		

	}

}
