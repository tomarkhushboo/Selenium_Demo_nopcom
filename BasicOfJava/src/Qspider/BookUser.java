package Qspider;

public class BookUser {

	public static void main(String[] args) {
		
		//b1 and b2 are the variable containing address of the object and every object address are diff
		Book b1 = new Book(500,"core-Java",400.81);
		System.out.println(b1); //b1 hold the address of the book its a object
		Book b2 = new Book(5000,"coreJava",400.50);
		System.out.println(b2); //b1 hold the address of the book its a object
		
        //o/p: Qspider.Book@15db9742 but this information is garbage
		
		boolean t = b1.equals(b2);
		
		if(t){
			System.out.println("both are equal");
		}
		else{
			System.out.println("both are different");
		}
		
		//compare to method user responsbility
		
		int p = b1.compareTo(b2); //compare to method give error as there is no implementation
			
				if(p>0){
					System.out.println("b1 book is greater");
				}
				else if(p == 0){
					System.out.println("both are same");
				}
				else if(p<0){
					System.out.println("b2 book is greater");
				}
		
	}

}
