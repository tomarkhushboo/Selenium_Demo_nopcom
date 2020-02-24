package javalearning;

public class ReturnExample {
	
	//declare a method
	
	public int add(int a,int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnExample abc = new ReturnExample();
		int res = abc.add(10, 20);
		System.out.println(res);
	}

}
