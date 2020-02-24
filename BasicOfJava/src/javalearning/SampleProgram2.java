package javalearning;

public class SampleProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int a; //variable declaration
		a = 100; //initialization
		int b =200; // variable declaration and initialization
		int c , d, e; // declare multiple variable
		int f = 40 , g = 50, h= 60; //declare multiple variable with initialization
		double l = 12345.789;
		char m = '*';
		boolean n = true;
		String q = "Selenium data types";
		System.out.println(q);
		System.out.println(l);
		System.out.println("Hellp Java");
		final int price = 100;
		System.out.println(price);
		
		//conditional statement
		
		if (a>b) {
			System.out.println("A is Bigg");
			
		}else {
			System.out.println("B is bigger");
		}
		
		//switch statement
		
		char grade = 'D';
		switch (grade) {
		case 'A':
			System.out.println("excelent");
			break;
		case 'B':
			System.out.println("great");
			break;
		case 'U':
			System.out.println("cool");
			break;
		default:
			System.out.println("Invalid Grade");
		}
		
		//Print 1 to 5 Numbers
		
		for (int i= 1; i<= 5;i++) {
			System.out.println(i);
		}
//Print 1 to 5 Numbers except 4 using for loop
		
		for (int j = 1; j<= 5; j++) {
			if (j!= 4)
			System.out.println(j);
		}
//Print 1 to 5 numbers using while loop	
		int x = 1;
		while (x <= 5 ) {
			System.out.println(x);
			x++;
		}
		
		
//Print 1 to 5 numbers using do while loop		
		
		int k = 1;
		do {
			System.out.println(k);
			k++;
		}while (k<=8);
		
		
		
		// Enhanced for loop
		
		String[] tools = {"Selenium","UFT","RFT","Silk Test"};
		for (String mytools:tools) {
			System.out.println(mytools);
		}
		
		
		
		
		
		
		
		
		
	}

}
