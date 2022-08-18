package firstAssignment;

public class Question_9 {
	/*
	 * 	 Input: Array 1: 2,4,5,6,7,9,10,13
         		Array 2: 2,3,4,5,6,7,8,9,11,15
		 Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
	 */

	public static void main(String[] args) {
		
		int[] array1 = {2,4,5,6,7,9,10,13};
		int[] array2 = {2,3,4,5,6,7,8,9,11,15};
		
		
		int m = array1.length;
		int n = array2.length;
		int[] mergedArray = new int[m+n];
		int i = 0 , j = 0 ,k=0;
		
		while(i < m || j < n) {
			
			if(i==m) {
				mergedArray[k++] = array2[j++];
			}else if(j==n) {
				mergedArray[k++] = array1[i++];
			}else if(array1[i] == array2[j]) {
				mergedArray[k++] = array1[i++];
				j++;
			}else if(array1[i] > array2[j]) {
				mergedArray[k++] = array2[j++];
			}else if(array1[i] < array2[j]) {
				mergedArray[k++] = array1[i++];
			}else if(i<m) {
				mergedArray[k++] = array1[i++];
			}else {
				mergedArray[k++] = array2[j++];
			}
		}
		
		for(int l = 0 ; l < k ; l++) {
			System.out.print(mergedArray[l]+" ");
		}

	}

}
