package OOP3;

public class Bmw extends Car{
	
	public Bmw(){
		System.out.println("BMW - CONST");
	}

	@Override
	  public void start() {
		System.out.println("BMW - start");
		
	}
@Override	
     public void stop(){
	     System.out.println("BMW - stop");
}
}
