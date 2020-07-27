package OOP1;

public class Bmw extends Car {
	
	@Override
	public void start(){
		System.out.println("Bmw --- Start");
	}

	public void brake(){
		System.out.println("Bmw --- Brake");
	}
	

	public static void key(){
		System.out.println(" Bmw --- Key");
	}
}
