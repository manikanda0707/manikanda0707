package employeeDetails;

/* Project   :EmployeeDetails
     Package   :org.emp
     Class     :Employee 
     Methods   :empId()

Description
You have to overload the method empId() based on different datatype in arguments.*/


public class Employee {
 
	public void empID(int id)
	{
		System.out.println(id);
	}
	public void empID(String grade)
	{
		System.out.println("Employee grade is: " +grade);
	}
	public void empID(Long mobno)
	{
		System.out.println(mobno);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
				emp.empID(842071);
				emp.empID("manager");
				emp.empID(9677494041l);
	}
}
