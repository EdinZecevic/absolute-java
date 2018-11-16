package teacher;

public class PhysicsTeacher extends Teacher{
	
	private double coeficient;
	
	public PhysicsTeacher(){
		super();
		coeficient=0;
	}
	
	public PhysicsTeacher(String _name, String _surname, double _numberOfWorkinHours, double _salary, double _coeficient){
		super(_name, _surname, _numberOfWorkinHours, _salary);
		coeficient=_coeficient;
	}
	
	public PhysicsTeacher(PhysicsTeacher physicsTeacher){
		super(physicsTeacher);
		coeficient=physicsTeacher.coeficient;
	}
	
	public double getCoeficient(){
		return coeficient;
	}
	
	public void setCoeficient(double _coeficient){
		coeficient=_coeficient;
	}
	
	public void setSalary(double _salary){
		super.setSalary(_salary);
	}
	
	public String toString(){
		return(super.toString()+""+coeficient);
	}
	
	public boolean equals(PhysicsTeacher physicsTeacher){
		return (super.equals(physicsTeacher) && coeficient==physicsTeacher.coeficient);
	}

}
