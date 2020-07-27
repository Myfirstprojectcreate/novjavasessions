package OOP1;

public class TestOop1 {

	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.brake();
		b.tyres();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.tyres();
		
		// Top Casting -  Child class object created with parent class reference variable.
		
		Car c1 = new Bmw();
		
		Car c2 = (Car) new Bmw();
		
		c1.start();
		c1.stop();
		c1.tyres();
	
		c2.start();
		c2.stop();
		c2.tyres();
		
		//DownCasting - Class cast Exception
		
	//	Bmw b1 = (Bmw) new Car();
		
		if ( b instanceof Bmw)
		{
			System.out.println("Pass");
		}
		
		if( c instanceof Car){
			System.out.println("Pass");
		}
		if (c1 instanceof Bmw){
			System.out.println("Pass");
		}
		if ( c2 instanceof Car){
			System.out.println("Pass");
		}
		
		if ( c instanceof Bmw){
			System.out.println("Pass");
		}
		
		
		
	}
}	
		
		
		
	


		

	
