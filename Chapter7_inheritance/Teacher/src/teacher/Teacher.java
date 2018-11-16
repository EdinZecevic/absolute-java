package teacher;
public class Teacher {
	private String name;
	private String surname;
	private double numberOfWorkinHours;
	private double salary;
	
	public Teacher(){
		name="";
		surname="";
		numberOfWorkinHours=0;
		salary=0;
	}
	
	public Teacher(String _name, String _surname, double _numberOfWorkinHours, double _salary){
		name=_name;
		surname=_surname;
		numberOfWorkinHours=_numberOfWorkinHours;
		salary=_salary;
	}
	
	public Teacher(Teacher teacher){
		name=teacher.name;
		surname=teacher.surname;
		numberOfWorkinHours=teacher.numberOfWorkinHours;
		salary=teacher.salary;
	}
	
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public double getNumberOfWorkinHours(){
		return numberOfWorkinHours;
}
	public double getSalary(){
		return salary;
}

	public void setName(String _name){
		name=_name;
	}
	public void setSurname(String _surname){
		surname=_surname;
	}
	public void setNumberOfWorkinHours(double _numberOfWorkinHours){
		numberOfWorkinHours=_numberOfWorkinHours;
}
	public void setSalary(double _salary){
		salary=_salary;
}
	public String toString(){
		return(name+""+surname+""+numberOfWorkinHours+""+salary);
	}
	public boolean equals(Teacher teacher){
		return(name.equals(teacher)&& surname.equals(teacher) && numberOfWorkinHours==teacher.numberOfWorkinHours && salary==teacher.salary);
	}
}