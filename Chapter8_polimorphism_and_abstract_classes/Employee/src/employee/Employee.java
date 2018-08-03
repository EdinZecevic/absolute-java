package employee;

public class Employee {
	
	public String name;
	public int id;
	public String department;
	public double salary;
	public String designation;
	
	public Employee() {
		name="no name";
		id=0;
		department="no department";
		salary=0;
		designation="no designation";
	}
	public Employee(String name) {
		setName( name);
		id=0;
		department="no department";
		salary=0;
		designation="no designation";
	}
	public Employee(String name,int id) {
		setName( name);
		setId( id);
		department="no department";
		salary=0;
		designation="no designation";
	}
	public Employee(String name,int id,String department) {
		setName( name);
		setId( id);
		setDepartment( department);
		salary=0;
		designation="no designation";
	}
	public Employee(String name,int id,String department,double salary) {
		setName( name);
		setId( id);
		setDepartment( department);
		setSalary( salary);
		designation="no designation";
	}
	public Employee(String name,int id,String department,double salary,String designation) {
		setName( name);
		setId( id);
		setDepartment( department);
		setSalary( salary);
		setDesignation( designation);
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
	
	public String equals(String string,String string2) {
		if(string==string2) {
			return ("They are the same");
		}
		else
			return ("They are not the same");
	}
	
	public int addBonus() {
		return 200;
	}
	
	public String toString() {
		return (name+" "+name+" "+department+" "+salary+" "+designation);
	}
	
	public double setSalaryFor(String designation,int salary, Employee object) {
		if(designation=="Menager") {
			return (salary+object.addBonus());
		}
		else if (designation=="Clerk")
			return (salary+object.addBonus());
		else 
			return (salary+addBonus());
	}
	}

