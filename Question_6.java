package firstAssignment;

import java.util.Scanner;

/*
 * 20
 * Group 1    Group 2	Group 3		Group 4
	101 		102		  103		  104
	105			106		  107		  108
	109			110		  111		  112
	113			114		  115		  116
	117			118		  119		  120

 */
public class Question_6 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println(" Enter the total of Students : ");
	int total = scan.nextInt();
	
	if(total%4 != 0) {
		System.out.println("Invalid input , input should be multiple of 4 ");
		return;
	}
	
	int[] Group1 = new int[total/4];
	int[] Group2 = new int[total/4];
	int[] Group3 = new int[total/4];
	int[] Group4 = new int[total/4];
	int j = 0 ;
	
	for(int i = 101 ; i < 100+total ; i++) {
		Group1[j] = i++;
		Group2[j] = i++;
		Group3[j] = i++;
		Group4[j] = i;
		j++;
	}
	
	System.out.println("	Group 1	| Group 2 | Group 3	| Group 4");
	for(int i = 0 ; i < Group1.length ; i++) {
		System.out.println("   	 "+Group1[i]+"    |   "+Group2[i]+"   |   "+Group3[i]+"       |   "+Group4[i]);
	}
	
	}

}
