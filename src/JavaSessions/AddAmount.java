package JavaSessions;

public class AddAmount {
	
	int amount = 50;
	
	public AddAmount (){
		
		
	}
	public AddAmount(int a){
		
		
		amount = amount + a;
		
	}

	public static void main(String[] args) {
		AddAmount a1 = new AddAmount();
		AddAmount a2 = new AddAmount(20);
		
		
		System.out.println("Total amount in Piggy bank : " + a2.amount);
	}

}
