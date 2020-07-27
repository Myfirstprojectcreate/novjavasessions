package AbstractConcept;

public class LoginPage extends Page {
	
	public LoginPage(){
		System.out.println("LP - Constructor");
	}

	@Override
	public void header() {
		System.out.println("Loginpage - Header");
		
	}

	@Override
	public void footer() {
		
		System.out.println("Loginpage - Footer");
	}
	
	
	public HomePage login(String un,String pw){
		System.out.println("Login with un and pwd");
		System.out.println("Login with" + un + "and "+ pw);
		return new HomePage();
	}

}
