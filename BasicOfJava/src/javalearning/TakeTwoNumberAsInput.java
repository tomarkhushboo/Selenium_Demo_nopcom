package javalearning;

import java.util.Scanner;

public class TakeTwoNumberAsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = scan.nextInt();
		System.out.print("Input second number: ");
		int num2 = scan.nextInt();
		System.out.println("num1 * num2 = " +num1 * num2);

	}

}
