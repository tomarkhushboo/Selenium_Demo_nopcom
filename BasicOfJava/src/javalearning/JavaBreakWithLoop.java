package javalearning;

/**
 * @author khushboo
 *
 */
public class JavaBreakWithLoop {

	public static void main(String[] args) {
		// Java Break Statement with for Loop
		for (int i = 1;i<=10;i++) {
			if(i == 5) {
				//break this loop
				break;
			}
			System.out.println(i);
		}
//Java Break Statement with Inner Loop
		
		for(int j =1;j<=3;j++) {
			for(int k=1;k<=3;k++) {
				if(j == 2 && k ==2) {
					//break statement
					break;
				}
				System.out.println(j + " " +k);
			}
		}

//Java Break Statement with Inner Loop
		int i = 1;
		while(i<=10) {
			if(i == 5) {
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}
//Java Break Statement in do-while loop
		
int m = 1;
do {
	if(m == 4) {
		m++;
		break;
	}
	System.out.println(m);
	m++;
} while(m<=10);

		
//Java break in switch

int number = 20;

switch (number) {
case 10: System.out.println("10");
break;
case 20: System.out.println("20");
break;
}

	
	
		
		
		
		
    
	}

}
