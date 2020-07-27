package OOP2;



public interface IndianMedical extends WHO {
	
	int minambulance = 50;

	public void emergencyServices();
	
	public void ambulanceServices();
	
	public static void test(){
		System.out.println("Indian medical --- test");
	}
	
	public default void demo(){
		
	}

}
//Cannot create object of interface
//100% abstraction - the class that implements the interface should implement the methods and 
//define the business logic .Interface gives the prototype and the child class should implement the methods.
//Interface variables are static in nature by default.
//No Static methods