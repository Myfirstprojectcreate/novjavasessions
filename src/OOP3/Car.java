package OOP3;

public abstract class Car {
	
	int colour;
	public Car(){
		System.out.println("Car --- CONST");
	}
	public abstract void start();
	
	public void stop(){
		System.out.println("Car ---------Stop[");
	}
	

}
// 0 - 100% partial abstraction