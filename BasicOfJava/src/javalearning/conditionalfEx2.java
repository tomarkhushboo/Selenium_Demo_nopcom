package javalearning;

public class conditionalfEx2 {

	public static void main(String[] args) {
		// when more than one condition is True : Nested if
		
		int a= -100, b = 1000, c = 20, d = 700;
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("A is big number");
			} else {
				System.out.println("A is not a big number -> 3rd condition is false");
			}
		} else {
			System.out.println("A is not big -> 2nd condition is false");
		}

	} else {
		System.out.println("A is not big -> 1st condition is false");}
		
		// this program will only execute when all teh condition are true
		
// if any of the condition is failed nothing will execute as there is no else 

		int m = 100, n = 20, o = 30, p = 40;
		
		//compound condition for same program
		
		if((m>n)&&(m>n)&&(m>o)&&(m>p)) {
			
			System.out.println("m is a big number");
		} else {
			System.out.println("m is not a big number");
		}
}
}
