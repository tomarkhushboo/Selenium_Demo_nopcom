package javalearning;

import java.util.Scanner;

public class EvenOrODD {
	public static void main(String[] args) {
		int num;
		System.out.println("ENTER AN INTEGER NUMBER: ");
		//The input provided by user is stored in num
		Scanner input = new Scanner (System.in);
		num = input.nextInt();
		/**
		 * if number is divisible by 2 then even else odd
		 */
		if (num % 2 == 0) {
			System.out.println("Entered number is even");
		}
		else {
			System.out.println("entered number is odd");
		}
	}

}
