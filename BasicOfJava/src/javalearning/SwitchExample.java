package javalearning;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char grade = 'A';
      
      switch (grade) {
      case 'A' : System.out.println("excelent");
      break;
      
      case 'B': System.out.println("good");
      break;
      
      case 'c': System.out.println("Poor");
      break;
      
      default:
    	  System.out.println("invalid grade");
      }
      
      //above code with if -else
      
     if (grade == 'A' ) {
    	 System.out.println("excelent");}
    	 else if (grade == 'B') {
    		 System.out.println("good");}
    	 else if (grade == 'C') {
    			 System.out.println("Poor");} 
    	 else { 
    		 System.out.println("Invalid grade");
    		 } 
    	 
    	 
     
      
      //switch example2
      
      int number = 300;
      // switch expression
      
      switch(number) {
      // case statement
      
      case 10 : System.out.println("10");
      break;
      case 20 : System.out.println("20");
      break;
      case 30: System.out.println("30");
      break;
      default: System.out.println("not in 10, 20, 30");
      break;
      }
      
    //where we are printing days name for the given number  
      
      int days = 70;
      
      switch(days) {
      case 1: System.out.println("Monday");
      break;
      case 2: System.out.println("Tuesday");
      break;
      case 3: System.out.println("Wed");
      break;
      case 4: System.out.println("thur");
      break;
      case 5: System.out.println("fri");
      break;
      case 6: System.out.println("sat");
      break;
      case 7: System.out.println("sunday");
      break;
      default: System.out.println("day does not exists");
      break;
      }
      
      //switch cases without break statements
      
      char vowel = 'e';
      
      switch(vowel) {
      case 'a' : System.out.println("is a vowel");
      case 'e' : System.out.println("is a vowel");
      case 'i' : System.out.println("is a vowel");
      case 'o' : System.out.println("is a vowel");
      case 'u' : System.out.println("is a vowel");
      default: System.out.println("Consonant");
      }
      
      
      
	}

}
