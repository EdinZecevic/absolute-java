package employee;

public class Employee {
	
	public String name;
	public int id;
	public String department;
	public double salary;
	public String designation;
	public int deduction;
	
	public Employee() {
		name="no name";
		id=0;
		department="no department";
		salary=0;
		designation="no designation";
		deduction=0;
	}
	public Employee(String name,int id,String department,double salary,String designation,int deduction) {
		setName( name);
		setId( id);
		setDepartment( department);
		setSalary( salary);
		setDesignation( designation);
		setDeduction(deduction);
	}
	
	public Employee(Employee employee) {
		name=employee.name;
		id=employee.id;
		department=employee.department;
		salary=employee.salary;
		designation=employee.designation;
		deduction=employee.deduction;
	}
	public void setDeduction(int deduction) {
		this.deduction=deduction;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public int getDeduction() {
		return deduction;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	
	public boolean equalsDesignation(Employee employee) {
		if(getDesignation().equals(employee)) {
			return true;
		}
		else
			return false;
	}
	
	public double addBonus() {
		return (salary+200);
	}
	public int getBonus() {
		return 200;
	}
	
	public String toString() {
		return (name+" "+name+" "+department+" "+salary+" "+designation+""+deduction);
	}
	public boolean equals(Employee employee) {
		return(name.equals(employee.name) && id==employee.id && department.equals(employee.department) 
				&& salary==employee.salary && designation.equals(employee.designation) && deduction==employee.deduction);
	}
	
	
	}
