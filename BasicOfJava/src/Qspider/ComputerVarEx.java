package Qspider;

/**there are two class computer and ComputerVarEx programm name will be ComputerVarEx as actual object 
 * orient programming is happening here
 * @author khushboo
 *
 */

class Computer{
	int ram;
	int rom;
	static double wifi;
}

public class ComputerVarEx {

	public static void main(String[] args) {
		// create object for computer class
		
		Computer attendance = new Computer();
		Computer admin = new Computer();
		Computer myself = new Computer();
		
		// give value to ram , rom and wifi
		
		//use the reference so if static use refrence as class name
		
		Computer.wifi = 50.5;
		
		//non static are reffered using object name
		attendance.ram = 2;
		attendance.rom = 120;
		
		myself.ram = 8;
		myself.rom = 900;
		
		admin.ram = 4;
		admin.rom = 500;
		
		System.out.println("computer wifi = " +Computer.wifi);
		System.out.println("attendance rom size = " +attendance.rom);

	}

}
