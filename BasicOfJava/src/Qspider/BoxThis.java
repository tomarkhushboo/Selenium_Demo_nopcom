package Qspider;


public class BoxThis {

	
		// volume of a box
		double length;
		double height;
		double breadth;
		BoxThis(){
			System.out.println("default constructor");
		}
		BoxThis(double m){
			//constructor chaining using call to this
			//this(); will do to default
			this(m,m,m);
			System.out.println("1 -Parameter constructor");
		}
		BoxThis(double m,double n){
			//constructor chaining using call to this
			this(m,m,n);
			System.out.println("2 -Parameter constructor");
		}
		
		BoxThis(double l,double b,double h){
			length = l;
			breadth = b;
			height = h;
			System.out.println("3- Parameter constructor");
		}
      void volume(){
    	  System.out.println("lenght " +length);
    	  System.out.println("breadth " +breadth);
    	  System.out.println("height " +height);
    	  double volume = length*breadth*height;
    	  System.out.println("volume " +volume);
      
	}

}

