package javalearning;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
	
	//Print 1 to 10 in reverse order
	
	int j=10;
	
	do {
		System.out.println(j);
		j--;
	}
	while(j>0);
	
	//print 1 to 5 except 3rd number
	
	int k = 1;
	
	do {
		if(k!= 3) {
		System.out.println(k);
	}
		k++;
	} while(k<=5);
	

}
}
