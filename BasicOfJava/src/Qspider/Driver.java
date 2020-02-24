package Qspider;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loosely coupled	
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("Enter a car name");
		String t = i.next();
		CarMethodOverEx a = HelperClass.getCar(t);
		a.start();
		a.move();
		a.horn();
		
		/* tight coupled
		 * Scanner t = new Scanner(System.in);
		 * System.out.println("Enter you car");
		System.out.println("Enter 1 for Audi");
		System.out.println("Enter 2  for bmw car");
		System.out.println("Enter 3 for maruti car");
		int op = t.nextInt();
		CarMethodOverEx a = null;
	
		
		if(op== 1) {
			 a = new AudiQ3();
			}
		else if(op== 2) {
			 a = new Bmw();
			}
		if(op== 3) {
			 a = new Maruti800();
			}
		a.start();
		a.move();
		a.horn();*/
	}

}
