package javalearning;

public class LogicalAndOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000, b= 500 , c = 1200;
		 if (a>b && a>c) {
			System.out.println("A is a big number");
		 } else {
			 System.out.println("A is not a big number");
		 } // true && true = true so A is big number
		 // true && false = false
 
		 if (a>b || a>c) {
				System.out.println("A is a big number");
			 } else {
				 System.out.println("A is not a big number");
			 }
		 
		 if (!(a>b && a>c)) {
				System.out.println("A is a big number");
			 } else {
				 System.out.println("A is not a big number");
			 }
		 
	}

}
