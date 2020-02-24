package javalearning;

public class ForLoopEx {

	public static void main(String[] args) {

		// number 1 to 10 in reverse order
		
		for (int i=10; i>0 ; i--) {
           System.out.println(i);			
		}
		
		// print 1 to 10 in reverse order instead of 4th and 9th
		
		for (int i=10; i>=1 ; i--) {
	          if (!(i == 4 || i == 9)){
	        	  System.out.println(i);
	          }	
			}
	}

}
