package javalearning;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i = 1;
	
	while (i <= 10) {
		System.out.println(i);
		i++;
	}
	
	//Print 1 to 5 number except 4th number

	int j = 1;
	
	while(j<=5) {
		if (j != 4 ) {
			System.out.println(j);
		}
		j++;
	}
	
	// print number in reverse order
	
	int k =10;
	
	while(k >= 1) {
		System.out.println(k);
		k--;
	}
	
	// print 1 t0 10 number except 4th and 9th
	
	int n = 10;
	
	while(n >= 1) {
		if(!((n == 4) || (n == 9))) {
			System.out.println(n);
		
		} n--;
	}
	}

}
