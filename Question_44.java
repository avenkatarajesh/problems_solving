package firstAssignment;
//) Java Program to print the duplicate elements of an array
public class Question_44 {

	public static void main(String[] args) {
		
		int[] arr = {1,-2,4,7,1,4,5,-4,7,1,0,0,5,6,6};
		int len=0;
		int n = arr.length;
		
		for(int i = 0 ; i < n ; i++) {
			int temp = arr[i];
			int count = 0;
			if(arr[i]==0) {
				continue;
			}
				for(int j = i ; j < n ; j++ ) {
					if(arr[j] == temp){
						arr[j] = 0;
						count++;
					}
				}
			len+=count;
			if(count > 1) {
			for(int k = 1 ; k < count ; k++ ) {
				System.out.print(temp+" ");
			}
			}
		}
	
		if(len < arr.length) {
			int l = n - len ;
			if(l > 1) {
				for(int k = 1 ; k < l ; k++ ) {
					System.out.print(0+" ");
				}
			}
		}
		
	}

}
