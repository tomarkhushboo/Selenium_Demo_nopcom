package Qspider;

//compare to is not a method of object class so its not present in book class
//its a method of comparable interface so we have to inherit it

public class Book implements Comparable{
	int pg;
	String ti;
	double pr;
	
Book(int p,String t,double price){
		pg =p;
		ti =t;
		pr = price; //parameterize constructor
		System.out.println("parameterize constructor");
	}
	
	/*give implement and comparable method to book class 
	 then give implementation using compareTo using method overriding
	 object ab up casting happening as object class is super class
	 b1 and b2 are local variable of book user class can not be use here b1 use this and for b2 down casting
     pages we are comparing and pages are of int type */
public int compareTo(Object ab)
{ 
		Book l = (Book)ab;
		
		return  (this.ti).compareTo(l.ti); // to compare string
		
		// to compare boolean and int
		/**if(this.pr > l.pr){
			return 5;
		}
		else if(this.pr == l.pr){
			return 0;
		}
		else {
			return -1;
		} **/
		
		//or
		
		//return this.pg - l.pg; minus approach applied to int only 500 - 5000 = -4500
		//compare price
		//return (int)(this.pr - l.pr); //minus approach is not proper for double so use if else approach
}
 
    
    // equal method: has to override the method
    public boolean equals(Object ab){
    	/**compare the properties like pages or price or title of two books
    	 //ab is variable of object class
    	//down casting from object class to book class
    	//if(this.pg == ab.pg){ ab changed to p variable
    	
    	//compare page this.pg == p.pg
    	//compare price 
    	//can not compare this.ti==p.ti as its non primitive datatype we can not cpmpare using ==
    	
    	//first code
    	  if(this.pr == p.pr){
    		return true;
        //b1 and b2 are the local variable of BookUser main method so we can not use it here,so getting error
    	//this keyword is use for current object
    	}
    	else{
    		return false;
    	}
    	reduce above first code and compare title page and price all */
    	
    	Book p = (Book)ab;
    	boolean w = (this.ti).equals(p.ti);
    	return w && this.pg == p.pg && this.pr ==p.pr; //all the condition should match
    	 
    	
    	
    }
	
	//Generalized format to override to string method
	public String toString(){
		String d = "Book_name="+ti+",pages="+pg+",price="+pr;
		return d;
	}
}


