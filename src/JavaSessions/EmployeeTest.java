package JavaSessions;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	EmployeeData e1 = new EmployeeData("Shyam",7654,54,"Eng",67788);
	System.out.println(e1.empname);
	System.out.println(e1.age);
	
	
	e1.setSalary(30000);
	System.out.println(	e1.getSalary());
	e1.getEmpName();
		

	}
}


