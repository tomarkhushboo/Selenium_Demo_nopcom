/**WAP to create a calculator can perform add/sub/mul/div/rem 
taking user input of two num and operation to be performed*/

package Qspider;

import java.util.Scanner;

public class CalculatorProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner cal = new Scanner(System.in);
     System.out.println("Enter your first number");
     int firstnum = cal.nextInt();
     System.out.println("Enter your Second number");
     int secondnum = cal.nextInt();
     System.out.println("Enter your operations to be performed on two numbers");
     int operation = cal.next().charAt(0);
     int Add = firstnum + secondnum;
     int sub = firstnum - secondnum;
     int mul = firstnum * secondnum;
     int div = firstnum / secondnum;
     int rem = firstnum % secondnum;
     
     if(operation == '+'){
    	 System.out.println("Addition of both the number " +Add);
     } else if(operation == '-'){
    	 System.out.println("Substraction of both the number " +sub);
     }else if(operation == '*'){
    	 System.out.println("multiplication of both the number " +mul);
     }else if(operation == '/'){
    	 System.out.println("division of both the number " +div);
     }else if(operation == '%'){
    	 System.out.println("remainder of both number " +rem);
     }
     
     
	}

}
