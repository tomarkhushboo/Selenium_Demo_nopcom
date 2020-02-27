package learnSelenium;

public class CompilteTimePolyEx {

	public static void main(String[] args) {
		Q t = new Q();
		t.m1(10);

	}
}
	
	class Q{
		void m1(){
			System.out.println("m1 method wth zero parameters");
		}
		
		void m1(int a){
			System.out.println("m1 method with 1 parameter");
		}
	}

