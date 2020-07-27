package OOP2;

public class TestMedical {

	public static void main(String[] args) {
		 Fortis fh = new Fortis();
		 
	fh.ambulanceServices();
	fh.cardioServices();
	fh.emergencyServices();
	fh.gastroServices();
	fh.neuroServices();
	fh.entServices();
	fh.orthopaedicServices();
	
	WHO wh =new Fortis ();

	
	//child class object can be referred by parent interface variable
	IndianMedical im =new Fortis();
	im.ambulanceServices();
	im.emergencyServices();
	im.demo();
	im.orthopaedicServices();
	
	//static method
	IndianMedical.test();
	

	}

}
