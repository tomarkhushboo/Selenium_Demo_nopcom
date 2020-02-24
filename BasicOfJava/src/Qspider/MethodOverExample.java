package Qspider;


class Xyzc{
	
	
	public static int add(int a, int b){
		return a+ b;
	}
	public static int add(int x, int y, int z){
		return x+y; 
		/** 1.method overloading does not depend on changing parameter name
		 * return x+y+0.0; adding 0.0 double to return method overloading will not depend on
		 * if we add one more parameter it will be allowed
		 */
	}
	public static double add(double a, double b){
		return a+ b;
	}
	
}
public class MethodOverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Xyzc.add(1,2));

	}

}
