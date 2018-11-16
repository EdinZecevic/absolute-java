package employee;

public class Clerk extends Employee {
	
	public Clerk() {
		super();
	}
	
	public Clerk(String name,int id,String department,double salary,String designation) {
		super(name,id,department,salary,designation);
	}
	
	public Clerk(Clerk clerk) {
		super(clerk);
	}
	
	public double addBonus() {
		return (salary+100);
	}

}
