package AbstractConcept;

public abstract class Page {
	
	public Page(){
		System.out.println("Page - Constructor");
	}

	public abstract void header();
	
	public abstract void footer();
	
	public final void logout() {
		
		System.out.println("Logout");
	}
}
