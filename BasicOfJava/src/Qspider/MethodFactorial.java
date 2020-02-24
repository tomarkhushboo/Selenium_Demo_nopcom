package Qspider;

public class MethodFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int fact1 = Xyz.factorial(5);
  int fact2 = Xyz.factorial(3);
  int fact3 = Xyz.factorial(2);
  int r = ((fact1*fact2)/(fact3));
  System.out.println(r);
	}
}

class Xyz{
		public static int factorial(int a)
		{
			int fact =1;
			for(int i =1;i<=a;i++)
			{
				fact = fact*i;
			} 
			return fact;
		}
	}
