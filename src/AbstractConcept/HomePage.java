package AbstractConcept;

public class HomePage extends Page {
	public HomePage(){
		System.out.println("HP - Constructor");
	}

	@Override
	public void header() {
		System.out.println("Homepage - Header");
		
	}

	@Override
	public void footer() {
		System.out.println("Homepage - Footer");
		
	}

	public void userDetails(){
		System.out.println("Homepage - UserDetails");
	}
}
