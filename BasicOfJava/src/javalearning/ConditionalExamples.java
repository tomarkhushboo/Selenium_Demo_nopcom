package javalearning;

public class ConditionalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100, b = 100;
		 if (!(b > a)) {
			 System.out.println("A is big");
		 }
		 else {
			 System.out.println("B is big");
		 }

	
	
	// single if condition
	
	if(a > b) {
		System.out.println("A is big");
	}
	
	// if - else condition
	
   if (a > b) {
	   System.out.println("A is big");}
	   else {
		   System.out.println("B is big");
	   }
   
   // multiple conditions
   
   int m =100 , n = 90 , o = 70;
   if((m > n) && (m > o)) {
	   System.out.println("m is a big number");
   }
   
   if((m > n) || (m > o)) {
	   System.out.println("m is a big number");
   }
   
   if((m > n) && (m > o)) {
	   System.out.println("m is a big number");
   } else if ((n > m)&&(n>o)){
	   System.out.println("n is big");
   }else {
	   System.out.println("o is small");
	   }
   
   
	   
}
   
   }



