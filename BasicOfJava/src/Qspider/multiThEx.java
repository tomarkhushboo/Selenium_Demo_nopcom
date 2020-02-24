package Qspider;

//code to print a-z
class P extends Thread{
	public void run(){
		for(char ch = 'a';ch<='z';ch++){
			System.out.println(ch);
			try{
				Thread.sleep(300);
			} 
			catch(InterruptedException e){
			}
		}
	}
}

class RS extends Thread{
	public void run(){
		for(int h = 100;h<=200;h++){
			System.out.println(h);
			try{
				Thread.sleep(400);
			}     
			catch(InterruptedException e){
			}
		}
	}
}
//user thread 
public class multiThEx {

	public static void main(String[] args) {
		// print a to z and 1 to 50 in parallel
		Thread t = new P();
		t.start();
		Thread q = new RS();
		q.start();
		for(int i = 1;i<=50;i++){
			System.out.println(i);
			try{
				Thread.sleep(400);
			} catch(InterruptedException e){
				
			}
			
		}

	}

}
