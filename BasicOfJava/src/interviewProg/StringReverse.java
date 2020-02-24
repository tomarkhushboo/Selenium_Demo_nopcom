package interviewProg;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// Reverse the string

		Scanner s = new Scanner(System.in);
		char[] ar = s.nextLine().toCharArray();
		System.out.println("string to be reversed" +s);
		
		
		for(int i =ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
		

	}
}


