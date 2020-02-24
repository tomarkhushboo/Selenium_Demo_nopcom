package javalearning;

import java.util.Scanner;

public class Qsp_prime_num {

	public static void main(String[] args) {
		// A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		System.out.println("print number between 1 and " +n);
		//loop through number one by one

		for(int i =1;i<=n;i++) {  // 4;4<=25;5

			//check if number is prime or not
			boolean isPrime = true;

			for (int j=2;j<i;j++) {            //2;2<4;
				if(i%j==0) {                  // 4%2==0;
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i +" ");  //1,2


			//



		}
	}

}
