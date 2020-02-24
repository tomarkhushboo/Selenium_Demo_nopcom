package Qspider;

public class HelperClass {

		public static CarMethodOverEx getCar (String name) {
			if (name.equalsIgnoreCase("AudiQ3")) {
				AudiQ3 t = new AudiQ3();
				return t;
			}
			else if(name.equalsIgnoreCase("BMW")){
				Bmw b = new Bmw();
				return b;
			}
			else if(name.equalsIgnoreCase("Mauri800")) {
				Maruti800 m = new Maruti800();
			}
			
			return null;
			
			
		}

	

}
