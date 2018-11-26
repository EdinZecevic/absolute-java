package employee;

public class Menager extends Employee {
	
	public Menager() {
		super();
	}
	
	public Menager(String name,int id,String department,double salary,String designation,int deduction) {
		super(name,id,department,salary,designation,deduction);
	}
	
	public Menager(Menager menager) {
		super(menager);
	}

	public double addBonus() {
		return (salary+300);
	}
	public int getBonus() {
		return 300;
	}
}