package AbstractConcept;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.header();
		lp.footer();
		HomePage hp = lp.login("admin", "admin");
		hp.header();
		hp.footer();
		lp.logout();

}
}	
	
