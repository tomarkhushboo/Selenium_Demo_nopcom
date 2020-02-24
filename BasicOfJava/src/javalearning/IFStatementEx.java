package javalearning;

public class IFStatementEx {

	public static void main(String[] args) {
//Java Program to demonstate the use of if statement. 
		int age = 20;
		//checking the age
		if (age > 18) {
			System.out.println("Age is greater than 18");
		}
		
		//A Java Program to demonstrate the use of if-else statement.  
		//It is a program of odd and even number.  
		
		int number = 13;
		
		if(number % 2 == 0) {
        System.out.println("Number is even");
	}  else {
		System.out.println("Number is odd number");
	}
		//A year is leap, if it is divisible by 4 and 400. But, not by 100.
		
		int year = 2020;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("year is a leap");
			
		} else {
			System.out.println("a common year");
		}
		
//Java Program to demonstrate the use of If else-if ladder.  
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
		
		int marks = 65;
		
		if (marks < 50) {
		System.out.println("fail");
		}
	else if (marks >= 50 && marks < 60)
	{
		System.out.println("D grade");
	}
	else if(marks >= 60 && marks <70) {
		System.out.println("C grade");
	}
	else if(marks >= 70 && marks < 80) {
		System.out.println("B grade");
	}
	else if(marks >= 80 && marks < 90) {
		System.out.println("A grade");
	}
	else if(marks >= 90 && marks < 100) {
		System.out.println("A+ grade");
	} 
	else
	{System.out.println("Invalid");
	}
		
//Program to check POSITIVE, NEGATIVE or ZERO:
			int num = -13;
			
			if(num > 0) {
				System.out.println("number is posotive");
			}
			else if (num < 0){
				System.out.println("number is negative");
			} else {
				System.out.println("Zero");
			}
//Java Program to demonstrate the use of Nested If Statement. 			
			
			int age1 = 10;
			int weight = 60;
			
		if(age1 >=18) {
			if(weight > 50) {
				System.out.println("you are eligible to donate the blood");
			}
		}	
			
			
			
//Java Program to demonstrate the use of Nested If Statement.    			
			
			if(age1 >=18) {
				if(weight > 50) {
					System.out.println("eligible to donate");
				} else {
					System.out.println("not eligible to donate");
				}
				
			} else {
				System.out.println("age must be greater the 18");
			}
			
			
		
	}
}
	


