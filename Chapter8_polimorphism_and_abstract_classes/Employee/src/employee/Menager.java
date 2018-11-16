package employee;

public class Menager extends Employee {
	
	public Menager() {
		super();
	}
	
	public Menager(String name,int id,String department,double salary,String designation) {
		super(name,id,department,salary,designation);
	}
	
	public Menager(Menager menager) {
		super(menager);
	}

	public double addBonus() {
		return (salary+300);
	}
}
