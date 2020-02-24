package Qspider;

public class Tcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer boss = new Computer();
		Computer pa = new Computer();
		
		Computer.wifi = 100.56;
		boss.ram = 16;
		boss.rom = 1024;
		
		pa.ram = 8;
		pa.rom =120;
		
		System.out.println("Tcs company wifi limit is = " +Computer.wifi);
		System.out.println("boss ram size = " +boss.ram);
           
	}

}
