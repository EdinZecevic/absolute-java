package teacher;

public class HistoryTeacher extends Teacher{

	private double salary;
	
	public HistoryTeacher(){
		super();
		salary=0;
	}
	
	public HistoryTeacher(String _name, String _surname, double _numberOfWorkinHours, double _salary){
		super(_name, _surname,  _numberOfWorkinHours,  _salary);
	}
	
	public HistoryTeacher(HistoryTeacher historyTeacher){
		super(historyTeacher);
		salary=historyTeacher.salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary( double _salary){
		salary=_salary;
	}
	
	public String toString(){
		return(super.toString()+""+salary);
	}
	
	public boolean equals(HistoryTeacher historyTeacher){
		return (super.equals(historyTeacher) && salary==historyTeacher.salary);
	}
}