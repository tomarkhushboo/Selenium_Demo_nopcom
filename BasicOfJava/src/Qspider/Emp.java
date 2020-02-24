package Qspider;

public class Emp implements Comparable  {

	    int id ; //employee id
		String name; //employee name
		int sal; //salary
		String dept ; //department
		double exp; //experience
		String comp; // company
		
		Emp(int i,String nm, int sl,String d,double e,String cm )
		{
			id = i;
			name = nm;
			sal = sl;
			dept = d;
			exp = e;
			comp = cm;
		}
		//toString method
        public String toString()
        {
            String k = "Employee Name = "+name+" , Emp id = "+id+" , Department = "+dept+
            		" , Experience = "+exp+" , Salary = "+sal+" , Company = "+comp;
            return k;
        }
        
        //equal methods
        
        public boolean equals(Object ab){
        	Emp p = (Emp)ab;
        	boolean r = this.name.equals(p.name);
        	boolean m = this.comp.equals(p.comp);
        	boolean n = this.dept.equals(p.dept);
        	return r && this.id == p.id && m && n && this.sal == p.sal && this.exp == p.exp;
        }
	   
        //compareTo method
        
        public int compareTo(Object ab){
        Emp l = (Emp) ab; 
        if(this.sal > l.sal){
    	return 1;
    	}
    	else if(this.sal == l.sal){
    	return 0;
    	}
    	else {
    	return -1;
    		}
        }
          
}
