package javalearning;

import java.util.Scanner;

public class TableOfInputNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
    System.out.print("Enter input number: ");
    int s  = in.nextInt();
    for (int i = 1; i<=10; i++) {
    	System.out.println(s + "x" +(i) + "=" + (s * (i)));

	}
	}

}
