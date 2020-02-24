package Qspider;

//aggregation example
class CarEngine{
	int noofstokes; //properties
	//Engine(int k)
	{
		//noofstokes =k;
	}
	void ignition(){
		 //behaviour
		System.out.println(noofstokes+ " engine ignited");
	}
	void rotating(){
		System.out.println(noofstokes+ " stroke engine is rotating");
	}
}



class Car{
	
	//car()
	{
		//Engine e = new Engine(4);
	}
	void start(){
		System.out.println("Car Started");
	}
	void moving(){
		System.out.println("car is moving");
	}
	void stop(){
		System.out.println("car is stopped");
	}
}


public class OopsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c = new Car();
c.start();
c.stop();
c.moving();
	}

}
