package javalearning;

//It is a Sample Program to Understand the Java program Structure and Syntax :package javalearning;

public class JavaSampleProgram {

//Create a Method with Arguments and return a value (Non Static method) 
	
public int add(int a, int b) {
	int result = a + b;
	return result;
}

//Create a method without Arguments and returns nothing (Non Static method)

public void comparison() {
	int x =100 ;
	int y = 20 ;
	if(x>y) {
		System.out.println("x is bigger");
	} 
	else {
		System.out.println("y is bigger");
	}
	
}
//Create a Method with Arguments and return a value (Static method) 

public static int sub(int a, int b) {
	int result = a - b;
	return result;
}

// create a Method without arguments and return nothing

public static void comparison2() {
	int a = 100;
	int b = 200;
	
	if (a>b) {
		System.out.println("a is bigger");
	}
	else {
		System.out.println("b is bigger");
		
	}	
}
//we call non static method invoking the object 
public static void main(String[] args) {
		//class object to call non static method
	JavaSampleProgram obj = new JavaSampleProgram();
	//call non static method add
	int res = obj.add(10,20);
	System.out.println(res);
	//or
	System.out.println(obj.add(20,40));
	
	//call non static without argument
	
	obj.comparison();
	
	//call  static method sub
	
	int abc = JavaSampleProgram.sub(200, 100);
	System.out.println(abc);
	//or
	System.out.println(JavaSampleProgram.sub(400, 10));
	
	//call  static method comparison2
     JavaSampleProgram.comparison2();
     //its best practise to use class name with static method we can also ignore class name
     comparison2();
	}

}
