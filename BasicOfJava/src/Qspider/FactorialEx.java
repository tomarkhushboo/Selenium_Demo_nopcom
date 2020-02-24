package Qspider;

import java.util.Scanner;


class FactorialEx{
	
public static int factmethod(int x){
 int factorial=1;
 
 for(int i=1;i<=x;i++){
	 factorial = factorial*i;
 }
 return factorial;
 }
}
class FactorialUser
{ 
public static void main(String[]args){
	Scanner p = new Scanner(System.in);
	System.out.println("user Enter your number to get factorial");
	int num = p.nextInt();
	System.out.println("factorial of the number " +FactorialEx.factmethod(num) +"is " +FactorialEx.factmethod(num));
	}
}


