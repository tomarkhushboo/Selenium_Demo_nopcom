package javalearning;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] languages = {"COBOL","JAVA","C","VB SCRIPT"};
		
		for(String lang:languages) {
			System.out.println(lang);
		
		}
		
		//using Array method
		
		int a = 10 , b = 5;
		int[] mathoperation = new int[3];
		mathoperation[0] = a+b;
		mathoperation[1] = a-b;
		mathoperation[2] = a*b;
		
		for (int operation :mathoperation) {
			System.out.println(operation);
		}

	}

}
