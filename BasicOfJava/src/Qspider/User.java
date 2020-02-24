package Qspider;

//superclass constructor chaining: call to super

class T{
	T(){
		this(10);
		System.out.println("T class default constructor");
	}
	T(int g){
		System.out.println("T class prameterize constructor");
	}
}
class R extends T{
	R(){
		super(10); //super with zero argument
		System.out.println("R class default constructor");
	}
	R(int k){
		super(); 
		System.out.println("R class prameterize constructor");
	}
}
class D extends R{
	D(){
		super(10); //super with zero argument
		System.out.println("D class default constructor");
	}
	D(int k){
		this(); 
		System.out.println("D class prameterize constructor");
	}
}
public class User {

	public static void main(String[] args) {
		//T p = new T();
		//R m = new R(10);
		D n = new D(10);
				

	}

}
