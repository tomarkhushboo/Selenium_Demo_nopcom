package javalearning;

public class ExampleUnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(--x);

		/*for (int i = 10; i>=1;i--) {
			System.out.println(i);
		}*/
		
		//Java Unary Operator Example 2: ++ and --
		
		int a = 10;
		int b = 20;
		System.out.println(a++ + ++a);//(10)+ (11+ 1) = 22
		System.out.println(b++ + b++);// 20 + 21 = 41
		
		
	}

}
