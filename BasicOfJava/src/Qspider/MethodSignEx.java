package Qspider;

class Arfa{
	
	public static void display() //static method
	{
		System.out.println("Hi Good Evening");
		System.out.println("Have a nice day");
		//void is return type so return is not needed
	}
	public  void display1() //non static method
	{
		System.out.println("Hi Good Afternoon");
		System.out.println("Have a great day");
		//void is return type so return is not needed
	}
	
	//with parameter
	
	public  void m1(int a) //non static method
	{
		System.out.println("Hi Good Afternoon");
		System.out.println("Have a great day");
		//void is return type so return is not needed
	}
}

public class MethodSignEx {

	public static void main(String[] args) {
		// user of arfa class
		
		//method is static then can be accessed using class name
		
		//execution starts with main method only
		
		System.out.println("main starts");
		Arfa.display();// static method calling using class name
		
		//to access non static method using object name only
		Arfa xyz = new Arfa();
		xyz.display1();
		System.out.println("main ends");
		

	}

}
