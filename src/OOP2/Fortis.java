package OOP2;

public class Fortis implements IndianMedical , USMedical, AustralianMedical{

	@Override
	public void emergencyServices() {
		System.out.println("Fortis ---Emergency Services ");
		
	}

	@Override
	public void ambulanceServices() {
		System.out.println("Fortis ---Ambulance Services ");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("Fortis ---Cardio Services ");
		
	}

	@Override
	public void gastroServices() {
		System.out.println("Fortis ---Gastro Services ");
				
	}
	
	public void neuroServices(){
		System.out.println("Fortis Own---Neuro Services ");
		}

	@Override
	public void entServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pathologyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orthopaedicServices() {
		// TODO Auto-generated method stub
		
	}


}
