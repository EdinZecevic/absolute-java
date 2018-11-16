package employee;

public class Test {
	public static void main(String[] args) {
		Employee Employee=new Employee("Edin",14030,"Menagment", 200,"Menager");
		Employee Employee1=new Employee("Edin",14030,"Menagment", 200,"Menager");
		
		Menager Menager= new Menager("Edin",14030,"Menagment", 200,"Menager");
		Clerk Clerk= new Clerk("Edin",14030,"Menagment", 200,"Menager");
		System.out.println("Equals method for designation ");
		System.out.println(Employee.equals(Employee1));
		System.out.println("Bonus default ");
		System.out.println(Employee.addBonus());
		System.out.println("Bonus for Menager ");
		System.out.println(Menager.addBonus());
		System.out.println("Bonus for Clerk ");
		System.out.println(Clerk.addBonus());
		
		
		
		
		
	}

}
