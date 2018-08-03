package person;

public class Teacher extends Person {

	public String subjectName;
	public int salary;
	
	public Teacher() {
		subjectName="no subject name";
		salary=0;
	}
	public Teacher(String subjectName) {
		SetSubjectName( subjectName);
		salary=0;
	}
	public Teacher(String subjectName,int salary) {
		SetSubjectNameAndSalary(subjectName,salary);
	}
	public void SetSubjectName(String subjectName) {
		this.subjectName=subjectName;
	}
	public void SetSalary(int salary) {
		this.salary=salary;
	}
	public void SetSubjectNameAndSalary(String subjectName,int salary) {
		this.subjectName=subjectName;
		this.salary=salary;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public int getSalary() {
		return salary;
	}
	public String displayDetails() {
		return (super.displayDetails() +" "+subjectName+" "+salary);
	}
}
