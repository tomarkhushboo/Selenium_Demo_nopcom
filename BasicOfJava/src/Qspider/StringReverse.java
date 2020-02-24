package Qspider;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// wap to check if string palindrome or not
		
		Scanner t= new Scanner(System.in);
		System.out.println("enter the string");
		String d = t.next();
		String temp = "";
		for (int i = d.length()- 1;i>=0;i--){
			temp=temp+d.charAt(i);
			}
		System.out.println(temp);
		
		if(d.equals(temp)){
			System.out.println("given string is a palindrome");
		}
		else{
			System.out.println("given string is not a palindrome");
		}

	}

}
