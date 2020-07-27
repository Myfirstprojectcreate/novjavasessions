package OOP1;

public class TestMember {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee ();
		
		emp1.name = "Tom";
		emp1.age = 25;
		emp1.phno = 7654567;
		emp1.address = "12 dbkhjd";
		emp1.salary = 23000.78;
		emp1.specialization = "Technician";
		
		Manager m1 = new Manager();
		
		m1.name = "Sam";
		m1.age = 45;
		m1.phno = 76545888;
	    m1.address = "14 gfdzshjko";
		m1.salary = 40000.78;
		m1.department= "Mechanical";
		
		System.out.println( "Employee Details");
		
		System.out.println( "Employee Name :" + emp1.name);
		System.out.println( "Employee Age :" + emp1.age);
		System.out.println( "Employee Ph.No :" + emp1.phno);
		System.out.println( "Employee Address:" + emp1.address);
		emp1.printSalary();
		System.out.println( "Employee Salary :" +emp1.salary);
		System.out.println( "Employee Specialization :" + emp1.specialization);
		
	System.out.println("-------------------------------------------------------------");
		
System.out.println( "Manager Details");
		
		System.out.println( "Manager Name :" + m1.name);
		System.out.println( "Manager Age :" + emp1.age);
		System.out.println( "Manager Ph.No :" + emp1.phno);
		System.out.println( "Manager Address:" + emp1.address);
		m1.printSalary();
		System.out.println( "Manager Salary :" +emp1.salary);
		
		System.out.println( "Manager Department :" + m1.department);
		
		
		
		
		
		
		
		

	}

}
