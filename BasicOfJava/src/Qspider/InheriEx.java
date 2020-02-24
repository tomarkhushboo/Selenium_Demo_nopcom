package Qspider;
//inheritance example
class Phone{ //super class
	void call(){
		System.out.println("called");
	}
	void sms(){
		System.out.println("message");
	}

}

class FeaturedPhone extends Phone{ //subclass
	void camera(){
		System.out.println("Image captured");
	}
	void music(){
		System.out.println("music play");
	}
}
class SmartPhone extends FeaturedPhone{ //subclass
	void videocall(){
		System.out.println("video");
	}
	void gps(){
		System.out.println("Location");
	}
}

public class InheriEx {

	public static void main(String[] args) {
		FeaturedPhone f = new FeaturedPhone();
		f.camera();
		f.music();
		f.call();
		
		System.out.println("---------------");
		SmartPhone s = new SmartPhone();
		s.call();
		s.gps();
		s.camera();
		s.music();

	}

}
