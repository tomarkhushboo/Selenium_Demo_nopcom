package Qspider;

import java.util.Scanner;

//factorial of (5!*3!/2!)

class Factorial{
	public static int factorial(int a){
		int fact =1;
		for(int i=1;i<=a;i++){
				fact = fact*i;
		}
		return fact;
	}
}

public class FactMethodEx {

	public static void main(String[] args) {
		// factorial user class
		Scanner p = new Scanner(System.in);
		
		System.out.println("Enter the number to take the factorial");
		int num = p.nextInt();
		System.out.println("factorial of the number " +num +" is " +(Factorial.factorial(num)));
				
				
	//System.out.println("Result is = " +((Factorial.factorial(5)*Factorial.factorial(3))/Factorial.factorial(2)));
		}

}
