package javalearning;

import java.util.Scanner;

public class AverageOfNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = in.nextInt();
		System.out.println("Enter second number");
	    int second = in.nextInt();
	    int avg = (first + second)/ 2;
	    System.out.println(avg);
    }
	

}
