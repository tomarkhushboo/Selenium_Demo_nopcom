package Qspider;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		System.out.println("enter array size");
		int size = t.nextInt();
		int arr01 [] = new int[size];
		System.out.println("enter array element");
		for(int i =0;i<size;i++){
			arr01[i]=t.nextInt();
			
		}
		System.out.println("Array elements are");
		for(int i =0;i<size;i++){
			System.out.println(arr01[i]);
		}
		
		
		
		
		int arr[] = new int[5];
		arr[0]=5;
		arr[1]=64;
		arr[2]=12;
		System.out.println(arr.getClass());
	   //array is an object due to new keyword in it and arr is just a object name holding address
		// to know the object arr class use object class .getclass
	    arr[4]=8;
	 //   arr[5]=56; error as array is till 4 index value
	    int arr1[]= {3,5,6,7,7,8}; //literal way of array declaration
	    System.out.println(arr[3]);
	    System.out.println(arr[4]);
	    System.out.println(arr1[0]);
	    double m[] = new double [10];
	    System.out.println(m[0]);
	    System.out.println(m.getClass());
	    boolean b[] = new boolean [10];
	    System.out.println(b[0]);
	    System.out.println(b.getClass());
	    byte by[] = new byte [10];
	    System.out.println(by[0]);
	    System.out.println(by.getClass());

	}

}
