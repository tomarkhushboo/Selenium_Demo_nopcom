package Qspider;

class W{
	int a;
	static W g;
	private W(){
		
	};// make constructor as private
	
	public static W getob(){
		if(g == null){
			g = new W();
		} 
		return g;
	} // provide public static to method
	
}

public class SingleTonEx {

	public static void main(String[] args) {
		
		W t = W.getob();
		W p = W.getob();
		W q = W.getob();
		t.a =500;
		System.out.println(q.a);

	}

}
