package Qspider;

public class Box {

	
		// volume of a box
		double length;
		double height;
		double breadth;
		Box(){
			System.out.println("default constructor");
		}
		Box(double m){
			length = m;
			breadth = m;
			height = m;
			System.out.println("1 -Parameter constructor");
		}
		
		Box(double l,double b,double h){
			length = l;
			breadth = b;
			height = h;
			System.out.println("Parameter constructor");
		}
      void volume(){
    	  System.out.println("lenght " +length);
    	  System.out.println("height " +height);
    	  System.out.println("breadth " +breadth);
    	  double volume = length*breadth*height;
    	  System.out.println(volume);
      
	}

}
