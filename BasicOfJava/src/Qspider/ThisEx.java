package Qspider;

class A{
	int x;
	 void display(int x){ //200
		System.out.println(x); //200
		System.out.println(this.x); //this.x represent current object ie d , d.x = 500
	 } //local variable is given highest priority
}
public class ThisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A d = new A();
      d.x = 500;
      d.display(200);
      
      A t = new A();
      t.x = 900;
      t.display(300);
	}

}
