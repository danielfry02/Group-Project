
public class Employee {
	protected String Name;
	protected int Id;
	protected int salary;
	protected String level;
	private int employeeCount;
	
public Employee() {
	Name= "addName";
	Id= employeeCount;
	salary= 0;
	level= "newHire";
	employeeCount++;
	
}
	
public Employee (String Name, int salary) {
	this.Name=Name;
	this.salary=salary;
	Id=employeeCount;
	employeeCount++;
}

public void getName () {
	
}

}
