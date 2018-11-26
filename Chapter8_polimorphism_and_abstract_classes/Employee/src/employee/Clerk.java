package employee;

public class Clerk extends Employee {
	
	public Clerk() {
		super();
	}
	
	public Clerk(String name,int id,String department,double salary,String designation,int deduction) {
		super(name,id,department,salary,designation,deduction);
	}
	
	public Clerk(Clerk clerk) {
		super(clerk);
	}
	
	public double addBonus() {
		return (salary+100);
	}
	public int getBonus() {
		return 100;
	}
}