package JavaSessions;

public class EmployeeData {
	
	public String empname;
	public int empid;
	public int age;
	public String dept;
	private int salary;
	
	
	
	public EmployeeData(String empname, int empid, int age, String dept, int salary) {
		this.empname = empname;
		this.empid = empid;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	
	public int getSalary(){
		return salary;
	}

	public void setSalary(int salary){
		this.salary=salary;
	}
	public void getEmpName(){
		
		System.out.println("get emp name");
		getEmpBonus();
		
	}
	
	private void getEmpBonus(){
		System.out.println("get emp bonus");
	}
	
	

	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData("joe",765,27,"IT",3000);
		
		
		e1.getEmpName();
		System.out.println("EmpName "+e1.empname);
		//e1.getEmpBonus();
		System.out.println("EmpSalary "+e1.salary);
	}

}
