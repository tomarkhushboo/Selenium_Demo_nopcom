//employee database

package Qspider;

public class EmployeeDb {

	public static void main(String[] args) {
		Emp e1 = new Emp(1,"Neha",30000,"HR",5.5,"IBM");
		Emp e2 = new Emp(1,"Neha",30000,"HR",5.5,"IBM");
		Emp e3 = new Emp(30,"Vivek",100000,"HelpDesk",6,"HP");
		
	   System.out.println(e1);
	   System.out.println(e2);
	   System.out.println(e3);
	   
	   // user implementation: equal method
	   
	   boolean t1 = e1.equals(e2);
	  
	   if(t1){
		   System.out.println("Entry in db are of same employee");
	   }
	  
	   else{
		   System.out.println("Entry in db are of diff employee");
	   }
	   
	   //using compare to method compare salary 
	   
	   int x = e1.compareTo(e3);
	   
	   if(x>0){
			System.out.println("Employee e1 is in good position");
		}
		else if(x == 0){
			System.out.println("both earn same");
		}
		else if(x<0){
			System.out.println("Employee e3 is in good position");
		}
	    
	   
	  
	}

}
