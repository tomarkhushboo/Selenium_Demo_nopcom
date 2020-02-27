package learnSelenium;

public class CallToSuperEx {
	public static void main(String[]args){
		D p = new D();
	}
}

class T{
	T(){
		System.out.println("T is Default constructor");
	}
	T(int g){ 
		System.out.println("T is parameterize constructor");
	}
}
class R extends T{
	R(){
		super(10);
		System.out.println("R class extends default constructor");
	}
	R(int h){
		super();
		System.out.println("R parameter constructor");
	}
}

class D extends R{
	D(){

		System.out.println("D class extends default constructor");
	}
	D(int h){
		super(10);

		System.out.println("D parameter constructor");
	}
}

//o/p: 






