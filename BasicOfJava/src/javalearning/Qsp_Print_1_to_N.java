//WAP to print 1 to N number

package javalearning;

import java.util.Scanner;

public class Qsp_Print_1_to_N {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter your nth number");
		
		
		int input = s.nextInt();
		for(int x = 1; x<=input; x++ ) {
			System.out.println(x);
		}
		
		

	}

}
