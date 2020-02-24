package javalearning;

public class ConditionalExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val = 2345;
		
		if ((val > 0)&& (val < 100)) {
			System.out.println("val is small number");
		}
		else if((val > 100 ) && (val <= 1000)) {
			System.out.println("Val is a medium number");
		}
		else if((val > 1000) && (val <= 10000)) {
			System.out.println("Val is big number");
		}
		else if (val > 10000) {
			System.out.println("val is a high number");
		}
		else {
			System.out.println("val is either 0 or -1");
		}
		
	}

}
