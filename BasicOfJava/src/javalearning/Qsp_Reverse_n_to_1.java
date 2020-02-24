//wap to reverse of n to 1 number

package javalearning;

import java.util.Scanner;

public class Qsp_Reverse_n_to_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your nth number");
		int input = s.nextInt();
		
		for(int x = input;x>=1;x--) {
			System.out.println(x);
		}

	}

}
