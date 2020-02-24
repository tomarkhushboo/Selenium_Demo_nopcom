package Qspider;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("enter your sentence to be reversed");
        String st = t.nextLine();
        String arr01[]  = st.split(" ");
        String temp = arr01[arr01.length-1];
        for(int i = arr01.length-2;i>=0;i--){
        	temp = temp +" "+ arr01[i];
        }
        System.out.println(temp);
	}

}
